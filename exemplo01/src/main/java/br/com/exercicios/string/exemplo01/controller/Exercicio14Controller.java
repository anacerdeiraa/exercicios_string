package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Equipamento;
import br.com.exercicios.string.exemplo01.entity.Mensagem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/exercicio14")
    public class Exercicio14Controller {
        @PostMapping("equipamento")

        public Equipamento EnviodeMensagem(@RequestBody Equipamento equipamento) {
            return equipamento;
        }

    }
