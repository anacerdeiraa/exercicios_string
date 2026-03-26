package br.com.exercicios.string.exemplo01.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Exemplo01Service {

    public int soma(int a, int b) {
        return a + b;
    }

}
