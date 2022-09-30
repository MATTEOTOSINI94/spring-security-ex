package com.example.springsecurityex.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "recruiter")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Recruiter implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome",nullable = false)
    private String nome;
    @Column(name = "cognome",nullable = false)
    private String cognome;
    @Column(name = "email",unique = true,nullable = false)
    private String emailAziendale;
    @Column(name = "password",nullable = false)
    private String password;

    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE},mappedBy = "recruiter")
    private List<Agenda> agenda;

    @Column(name = "role")
    private String role;


    public List<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
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

    public String getEmailAziendale() {
        return emailAziendale;
    }

    public void setEmailAziendale(String emailAziendale) {
        this.emailAziendale = emailAziendale;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    @Override
    public String toString() {
        return "Recruiter{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", emailAziendale='" + emailAziendale + '\'' +
                ", password='" + password + '\'' +

                '}';
    }
}
