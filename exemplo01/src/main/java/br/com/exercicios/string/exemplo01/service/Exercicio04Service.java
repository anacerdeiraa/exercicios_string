package br.com.exercicios.string.exemplo01.service;

import org.springframework.stereotype.Service;

@Service
public class Exercicio04Service {
    public boolean isPalindrome(String word) {

        String normalized = word.toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();

        return normalized.equals(reversed);
    }

}
