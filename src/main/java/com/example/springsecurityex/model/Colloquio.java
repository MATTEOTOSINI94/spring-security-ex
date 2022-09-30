package com.example.springsecurityex.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "colloquio")
public class Colloquio implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "id_posizione")
    private Posizione posizione;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "colloquio")
    private List<Agenda> agenda;

    @Column(name = "esito")
    private String esito;

    @Column(name = "data_appuntamento")
    private Timestamp dataAppuntamento;

    public Timestamp getDataAppuntamento() {
        return dataAppuntamento;
    }

    public void setDataAppuntamento(Timestamp dataAppuntamento) {
        this.dataAppuntamento = dataAppuntamento;
    }

    @Column(name = "tipo",nullable = false)
    private String tipoColloquio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    @Override
    public String toString() {
        return "Colloquio{" +
                "id=" + id +
                ", candidato=" + candidato +

                ", posizione=" + posizione +
                ", esito='" + esito + '\'' +
                ", tipoColloquio='" + tipoColloquio + '\'' +
                '}';
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }





    public Posizione getPosizione() {
        return posizione;
    }

    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public String getEsito() {
        return esito;
    }

    public void setEsito(String esito) {
        this.esito = esito;
    }

    public List<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
    }

    public String getTipoColloquio() {
        return tipoColloquio;
    }

    public void setTipoColloquio(String tipoColloquio) {
        this.tipoColloquio = tipoColloquio;
    }
}
