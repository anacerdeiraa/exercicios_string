package br.com.exercicios.string.exemplo01.service;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Exercicio06Service {
    public double calcularMedia (List<Double> notas){
        if (notas == null || notas.isEmpty()) {
            throw new IllegalArgumentException("Lista de notas vazia");
        }
        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
}
