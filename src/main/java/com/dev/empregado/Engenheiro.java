package com.dev.empregado;

public class Engenheiro extends Empregado {

    public Engenheiro(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return super.salario;
    }
}
