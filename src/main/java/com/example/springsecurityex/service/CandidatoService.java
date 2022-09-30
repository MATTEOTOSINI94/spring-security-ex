package com.example.springsecurityex.service;

import com.example.springsecurityex.dto.CandidatoDTO;
import com.example.springsecurityex.dto.trasformer.CandidatoTrasformer;
import com.example.springsecurityex.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CandidatoService {

    @Autowired
    CandidatoRepository candidatoRepository;

    public ResponseEntity<List<CandidatoDTO>> getAllCandidati(){
        List<CandidatoDTO> candidatoDTOList = CandidatoTrasformer.fromCandidatoToCandidatoDTO(candidatoRepository.findAll());
        return ResponseEntity.ok().body(candidatoDTOList);
    }


}
