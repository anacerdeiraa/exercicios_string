package br.com.exercicios.string.exemplo01.controller;

import br.com.exercicios.string.exemplo01.entity.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/exemplo02")
    public class Exemplo02Controller {

        @PostMapping("produto")
        public Produto cadastrarProduto(@RequestBody Produto produto) {
            return produto;
        }
    }

