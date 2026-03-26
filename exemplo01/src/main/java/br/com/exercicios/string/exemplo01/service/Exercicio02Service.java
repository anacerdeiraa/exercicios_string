package br.com.exercicios.string.exemplo01.service;

import br.com.exercicios.string.exemplo01.controller.Exercicio02Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Service
public class Exercicio02Service {
    public int romanoParaDecimal(String romano) {

        Map<Character, Integer> mapa = new HashMap<>();

        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int total = 0;

        for (int i = 0; i < romano.length(); i++) {

            int atual = mapa.get(romano.charAt(i));

            if (i + 1 < romano.length()) {
                int proximo = mapa.get(romano.charAt(i + 1));

                if (atual < proximo) {
                    total -= atual;
                } else {
                    total += atual;
                }

            } else {
                total += atual;
            }
        }

        return total;
    }
}
