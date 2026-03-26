package br.com.exercicios.string.exemplo01.entity;

import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;


public class Avaliacao {
    private String disciplina;
    private Double nota;
    private String aluno;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public Avaliacao(String disciplina) {
        this.disciplina = disciplina;
    }
}
