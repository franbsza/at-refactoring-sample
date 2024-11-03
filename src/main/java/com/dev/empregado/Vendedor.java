package com.dev.empregado;

public class Vendedor extends Empregado {

    private double comissao;

    public Vendedor(double salario) {
        super(salario);
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return this.salario + comissao;
    }
}
