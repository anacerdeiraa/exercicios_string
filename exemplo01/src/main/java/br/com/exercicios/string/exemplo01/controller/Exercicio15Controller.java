package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Emprestimo;
import br.com.exercicios.string.exemplo01.entity.Equipamento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio15")
public class Exercicio15Controller {
    @PostMapping("emprestimo")

    public Emprestimo EnviodeMensagem(@RequestBody Emprestimo emprestimo) {
        return emprestimo;
    }

}
