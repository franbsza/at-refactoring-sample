package com.dev.aluno;

import java.util.List;

public class Aluno {

    private String nome;
    private List<Double> notas;
    private double media;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
        this.calcularMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public void adicionarNotas(List<Double> notas) {
        notas.forEach(this::adicionarNota);
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia() {
        double total = 0;
        for (Double nota : notas) {
            total += nota;
        }
        this.media = total / notas.size();
    }
}
