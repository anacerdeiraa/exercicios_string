package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Alunos;
import br.com.exercicios.string.exemplo01.entity.Avaliacao;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio11")
public class Exercicio11Controller {
    @PostMapping("avaliacao")

    public Avaliacao RegistrodeAvaliação (@RequestBody Avaliacao avaliacao) {
        return avaliacao;
    }
}