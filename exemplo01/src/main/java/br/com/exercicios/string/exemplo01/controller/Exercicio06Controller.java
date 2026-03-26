package br.com.exercicios.string.exemplo01.controller;


import br.com.exercicios.string.exemplo01.service.Exercicio06Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/api/exercicio06")
public class Exercicio06Controller {


    @Autowired
    Exercicio06Service exercicio06Service;


    @GetMapping("media-de-notas")
    public String calcularMedia (@RequestParam List<Double> notas){
        double media = exercicio06Service.calcularMedia(notas);
        return "A media das notas e " + media;


    }
}
