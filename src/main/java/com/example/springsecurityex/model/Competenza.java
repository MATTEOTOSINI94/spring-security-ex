package com.example.springsecurityex.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "competenza")
public class Competenza implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    @Column(name = "id",unique = true,nullable = false)
    private Integer id;

    @Column(name = "descrizione",nullable = false)
    private String descrizione;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "competenza")
    private List<Curriculum> curricula;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "competenza")
    private List<Posizione> posiziones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Competenza{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", curricula=" + curricula +
                '}';
    }
}
