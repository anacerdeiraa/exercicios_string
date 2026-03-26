package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio04Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio04")

public class Exercicio04Controller {

    @Autowired
    Exercicio04Service exercicio04Service;

    @GetMapping()
    public String palindromo(@RequestParam String palindromo) {
        return exercicio04Service.isPalindrome(palindromo) ?
                "A palavra é um palíndromo " :
                "A palavra não é um palíndromo";
    }
}

