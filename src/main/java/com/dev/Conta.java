package com.dev;

public class Conta {
    public String nome;
    public double especial;
    public double saldo;

    public Conta(String nome, double saldo, double especial) {
        this.nome = nome;
        this.especial = especial;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEspecial() {
        return this.especial;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }

    public void Creditar(double valor){
        saldo += valor;
    }

    public double ConsultarSaldo(){
        return saldo;
    }

    public double CalcularSaldoEspecial() {
        return saldo += especial;
    }

    public double Debitar(double valor) {
        double saldo = CalcularSaldoEspecial();
        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        return saldo - valor;
    }
}
