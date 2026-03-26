package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exemplo01Service;
import br.com.exercicios.string.exemplo01.service.Exercicio01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio01")
public class Exercicio01Controller {
    @Autowired
    Exercicio01Service exercicio01Service;

    @GetMapping("binario-para-decimal/{a}")
    public String soma(@PathVariable String a){
        return "O número binário transformado para decimal é " + exercicio01Service.converteBinarioEmDecimal(a);
    }
}

