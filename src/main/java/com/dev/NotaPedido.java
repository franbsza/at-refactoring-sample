package com.dev;

import java.util.List;

public class NotaPedido {

    public static void main(String[] args) {
        exibirPedidos(criarDadosPedidos());
    }

    public static class Cliente {
        public String nome;
        public List<Pedido> pedidos; // <>

        public Cliente(String nome) {
            this.nome = nome;
        }
    }

    public static class Pedido {
        public double valor;

        public Pedido(double valor) {
            this.valor = valor;
        }
    }

    public static void exibirPedidos(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            exibirCabelho();
            double totalPedidos = calcularTotalPedidos(cliente.pedidos);
            exibirTotalPedidos(cliente, totalPedidos);
        }
    }

    private static void exibirTotalPedidos(Cliente cliente, double totalPedidos) {
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Total: " + totalPedidos);
    }

    public static void exibirCabelho() {
        System.out.println("**********************************");
        System.out.println("******** Total de pedidos ********");
        System.out.println("**********************************");
    }

    private static double calcularTotalPedidos(List<Pedido> pedidos) {
        double totalPedidos = 0;
        for (Pedido pedido : pedidos) {
            totalPedidos += pedido.valor;
        }
        return totalPedidos;
    }

    public static List<Cliente> criarDadosPedidos() {
        Pedido pedidoA = new Pedido(180.00);
        Pedido pedidoB = new Pedido(50.00);
        Pedido pedidoC = new Pedido(200.00);
        Pedido pedidoD = new Pedido(80.00);
        Cliente clienteA = new Cliente("Pedro");
        Cliente clienteB = new Cliente("Maria");
        clienteA.pedidos = List.of(pedidoA, pedidoB);
        clienteB.pedidos = List.of(pedidoC, pedidoD);
        return List.of(clienteA, clienteB);
    }
}
