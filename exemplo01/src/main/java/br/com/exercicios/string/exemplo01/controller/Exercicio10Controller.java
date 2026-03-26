package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Alunos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio10")
public class Exercicio10Controller {
    @PostMapping("aluno")
    public Alunos cadastrarAluno(@RequestBody Alunos aluno){
        return aluno;
    }

    }


