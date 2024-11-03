package com.dev.aluno;

import java.util.List;

public class Boletim {

    public static void main(String[] args) {
        Aluno alunoA = new Aluno("Gabriel", List.of(10.0, 9.0, 8.0, 7.0, 6.0));
        Aluno alunoB = new Aluno("Heitor", List.of(9.0, 8.0, 7.0, 6.0, 5.0));
        Aluno alunoC = new Aluno("Fabio", List.of(8.0, 7.0, 6.0, 5.0, 4.0));
        Aluno alunoD = new Aluno("Breno", List.of(7.0, 6.0, 5.0, 4.0, 3.0));
        
        List.of(alunoA, alunoB, alunoC, alunoD)
                .forEach(Boletim::imprimirBoletim);
    }

    private static void imprimirBoletim(Aluno alunoA) {
        System.out.println("Aluno: " + alunoA.getNome());
        System.out.println("Media: " + alunoA.getMedia());
    }
}
