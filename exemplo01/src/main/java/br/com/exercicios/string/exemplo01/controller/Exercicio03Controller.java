package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio03")
public class Exercicio03Controller {

    @Autowired
    Exercicio03Service exercicio03Service;

    @GetMapping("fatorial")
    public String fatorial(@RequestParam int fatorial){
      return "O valor fatorial é " + exercicio03Service.calculateFactorial(fatorial);
    }
}
