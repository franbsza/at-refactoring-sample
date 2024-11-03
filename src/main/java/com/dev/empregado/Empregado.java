package com.dev.empregado;

public abstract class Empregado {

    protected double salario;

    public Empregado(double salario) {
        this.salario = salario;
    }

    abstract double calcularSalario();
}
