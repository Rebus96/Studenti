package com.example.studenti.repository;

import com.example.studenti.entity.Studente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudenteRepository extends JpaRepository<Studente, Long> {
}
