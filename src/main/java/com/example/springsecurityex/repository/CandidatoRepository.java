package com.example.springsecurityex.repository;

import com.example.springsecurityex.model.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepository extends JpaRepository<Candidato,Long> {
}
