package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio08Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio08")
public class Exercicio08Controller {

    @Autowired
    Exercicio08Service exercicio08Service;

    @GetMapping("horas-para-minutos")
    public String converter(@RequestParam int horas){

    int minutos = exercicio08Service.horasParaMinutos(horas);
return"Minutos: "+minutos;


}
}
