package com.example.springsecurityex.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posizione")
public class Posizione implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "titolo",nullable = false)
    private String titolo;
    @Column(name = "descrizione",nullable = false)
    private String descrizione;
    @Column(name = "anzianita",nullable = false)
    private String anzianita;
    @Column(name = "data_chiusura",nullable = false)
    private Date dataChiusura;
    @ManyToOne
    @JoinColumn(name = "id_competenza")
    private Competenza competenza;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE},mappedBy = "posizione")
    private List<Colloquio> colloquios;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getAnzianita() {
        return anzianita;
    }

    public void setAnzianita(String anzianita) {
        this.anzianita = anzianita;
    }

    public Date getDataChiusura() {
        return dataChiusura;
    }

    public void setDataChiusura(Date dataChiusura) {
        this.dataChiusura = dataChiusura;
    }

    public Competenza getCompetenza() {
        return competenza;
    }

    public void setCompetenza(Competenza competenza) {
        this.competenza = competenza;
    }

    public List<Colloquio> getColloquios() {
        return colloquios;
    }

    public void setColloquios(List<Colloquio> colloquios) {
        this.colloquios = colloquios;
    }

    @Override
    public String toString() {
        return "Posizione{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", anzianita='" + anzianita + '\'' +
                ", dataChiusura=" + dataChiusura +
                ", competenza=" + competenza +
                ", colloquios=" + colloquios +
                '}';
    }
}
