package br.com.exercicios.string.exemplo01.entity;

import java.time.LocalDate;

public class Emprestimo {
    private String nome;
    private String item;
    private LocalDate data;

    public Emprestimo() {
    }

    public Emprestimo(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getData() {
        return data;
    }

    public Emprestimo(String nome, String item, LocalDate data) {
        this.nome = nome;
        this.item = item;
        this.data = data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}