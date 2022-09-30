package com.example.springsecurityex.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter@Setter
public class CandidatoDTO {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    private String luogoDiNascita;
    private String codiceFiscale;
    private String residenza;
    private String telefono;

    public CandidatoDTO(String nome, String cognome, Date dataDiNascita, String luogoDiNascita, String codiceFiscale, String residenza, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.luogoDiNascita = luogoDiNascita;
        this.codiceFiscale = codiceFiscale;
        this.residenza = residenza;
        this.telefono = telefono;
    }
}
