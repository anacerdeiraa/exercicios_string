package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/exercicio02")
public class Exercicio02Controller {
    @Autowired
    Exercicio02Service exercicio02Service;

    @GetMapping("romano-para-decimal")
    public String romanoParaDecimal(@RequestParam String romano) {
        //aqui chama o serviço da classe service
        return "O valor em decimal é " + exercicio02Service.romanoParaDecimal(romano);
    }
}

