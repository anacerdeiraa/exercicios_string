package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio05Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio05")
public class Exercicio05Controller {

    @Autowired
    Exercicio05Service exercicio05Service;

    @GetMapping("temperatura")
    public String temperatura(@RequestParam Double celsius){
        double fahrenheit = exercicio05Service.celsiusParaFahrenheit(celsius);
        return "Temperatura em Fahrenheit: "+fahrenheit;

    }
}
