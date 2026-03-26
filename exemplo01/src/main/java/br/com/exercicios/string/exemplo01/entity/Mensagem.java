package br.com.exercicios.string.exemplo01.entity;

import java.time.LocalDate;

public class Mensagem {
    private String remetente;
    private String destinatario;
    private String conteudo ;

    public Mensagem(){
    }

    public Mensagem(String remetente) {
        this.remetente = remetente;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
