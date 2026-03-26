package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Evento;
import br.com.exercicios.string.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio13")
public class Exercicio13Controller {
    @PostMapping("mensagem")

    public Mensagem EnviodeMensagem(@RequestBody Mensagem mensagem) {
        return mensagem;
    }
}
