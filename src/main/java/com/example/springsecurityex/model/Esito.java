package com.example.springsecurityex.model;

public enum Esito {
    OK("OK"),
    KO("KO"),
    Pending("Pending");

    private String esito;

    Esito(String esito){
        this.esito = esito;
    }

}
