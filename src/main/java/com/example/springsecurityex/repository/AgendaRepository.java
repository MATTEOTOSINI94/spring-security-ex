package com.example.springsecurityex.repository;

import com.example.springsecurityex.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
}
