package com.dev.empregado;

public class Gerente extends Empregado {

    private double bonus;

    public Gerente(double salario) {
        super(salario);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return this.salario + this.bonus;
    }
}
