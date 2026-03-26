package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Avaliacao;
import br.com.exercicios.string.exemplo01.entity.Evento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio12")
public class Exercicio12Controller {
    @PostMapping("evento")

    public Evento CadastroEventoEscolar(@RequestBody Evento evento) {
        return evento;
    }
    }

