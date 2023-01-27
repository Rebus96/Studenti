package com.example.studenti.controller;

import com.example.studenti.repository.StudenteRepository;
import com.example.studenti.entity.Studente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudenteController {

    private final StudenteRepository studenteRepository;

    public StudenteController(StudenteRepository studenteRepository) {
        this.studenteRepository = studenteRepository;
    }

    @GetMapping("/voti")
    public List<Studente> getAllStudenti() {
        return studenteRepository.findAll();
    }
}
