package br.com.exercicios.string.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio08Service {
    public int horasParaMinutos(int horas) {
        return horas * 60;
    }

}
