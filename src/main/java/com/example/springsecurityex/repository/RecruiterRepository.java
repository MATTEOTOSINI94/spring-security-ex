package com.example.springsecurityex.repository;

import com.example.springsecurityex.model.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<Recruiter,Long> {
    Recruiter findByEmailAziendale(String emailAziendale);
}
