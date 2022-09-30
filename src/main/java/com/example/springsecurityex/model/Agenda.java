package com.example.springsecurityex.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "agenda")
public class Agenda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_recruiter")
    private Recruiter recruiter;

    @ManyToOne
    @JoinColumn(name = "id_colloquio")
    private Colloquio colloquio;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    public Colloquio getColloquio() {
        return colloquio;
    }

    public void setColloquio(Colloquio colloquio) {
        this.colloquio = colloquio;
    }
}
