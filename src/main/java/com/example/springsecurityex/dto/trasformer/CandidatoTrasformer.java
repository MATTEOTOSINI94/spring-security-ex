package com.example.springsecurityex.dto.trasformer;

import com.example.springsecurityex.dto.CandidatoDTO;
import com.example.springsecurityex.model.Candidato;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CandidatoTrasformer {

    public CandidatoTrasformer(){

    }

    public static List<CandidatoDTO> fromCandidatoToCandidatoDTO(List<Candidato> cadidatoList){
        return cadidatoList.stream().map(candidato ->
                new CandidatoDTO(candidato.getNome()
                        ,candidato.getCognome()
                        ,candidato.getDataDiNascita()
                        ,candidato.getLuogoDiNascita()
                        ,candidato.getCodiceFiscale()
                        ,candidato.getResidenza()
                        ,candidato.getTelefono())
            ).collect(Collectors.toList());
    }
}
