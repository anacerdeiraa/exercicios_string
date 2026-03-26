package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.service.Exercicio07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exercicio07")
public class Exercico07Controller {

    @Autowired
    Exercicio07Service exercicio07Service;

    @GetMapping("numero-primo/{numero}")
    public String verificarPrimo(@PathVariable int numero) {
        boolean primo = exercicio07Service.isPrimo(numero);
        if (primo) {
            return "O numero informado e primo";
        }
        return "O numero informado nao e primo";


    }
}