package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio09")
public class Exercicio09Controller {

    @Autowired
    Exercicio09Service exercicio09Service;
    @GetMapping("area-triangulo")
    public String calcularArea (@RequestParam double base, @RequestParam double altura){
        double area = exercicio09Service.calcularAreaTriangulo(base, altura);
        return "Area do triangulo: " + area;
    }
}
