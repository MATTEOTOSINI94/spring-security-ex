package com.example.springsecurityex.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "curriculum")
public class Curriculum implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "path")
    private String path;
    @ManyToOne
    @JoinColumn(name = "id_candidato")
    private Candidato candidato;

    @ManyToOne
    @JoinColumn(name = "id_competenza")
    private Competenza competenza;

    @Column(name = "valutazione")
    private String valutazione;

    @Column(name="data_caricamento")
    @CreationTimestamp
    private Timestamp dataCaricamento;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public String getValutazione() {
        return valutazione;
    }

    public void setValutazione(String valutazione) {
        this.valutazione = valutazione;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Competenza getCompetenza() {
        return competenza;
    }

    public void setCompetenza(Competenza competenza) {
        this.competenza = competenza;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", valutazione='" + valutazione + '\'' +
                '}';
    }
}
