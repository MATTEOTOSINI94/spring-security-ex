package com.example.springsecurityex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="candidato")
public class Candidato implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome",nullable = false)
    private String cognome;
    @Column(name = "data_di_nascita",nullable = false)
    private Date dataDiNascita;
    @Column(name = "luogo_di_nascita")
    private String luogoDiNascita;
    @Column(name = "codice_fiscale")
    private String codiceFiscale;
    @Column(name = "residenza",nullable = false)
    private String residenza;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;


    public List<Colloquio> getColloquios() {
        return colloquios;
    }

    public void setColloquios(List<Colloquio> colloquios) {
        this.colloquios = colloquios;
    }
    @JsonIgnore
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE},mappedBy = "candidato",fetch = FetchType.LAZY)
    private List<Curriculum> curricula;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE},mappedBy = "candidato",fetch = FetchType.LAZY)
    private List<Colloquio> colloquios;


    public List<Curriculum> getCurricula() {
        return curricula;
    }

    public void setCurricula(List<Curriculum> curricula) {
        this.curricula = curricula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getLuogoDiNascita() {
        return luogoDiNascita;
    }

    public void setLuogoDiNascita(String luogoDiNascita) {
        this.luogoDiNascita = luogoDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", luogoDiNascita='" + luogoDiNascita + '\'' +
                ", codiceFiscale='" + codiceFiscale + '\'' +
                ", residenza='" + residenza + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", curricula=" + curricula+
                '}';
    }
}
