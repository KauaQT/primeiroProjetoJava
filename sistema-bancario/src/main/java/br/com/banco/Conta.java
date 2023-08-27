package br.com.banco;

import java.util.Scanner;

public class Conta {
    // atributos
    int agencia;
    int numero;
    double saldo;

    // abaixo o construtor padrão, importante para API
    public Conta() {

    }

    // construtor de classe, para popular informações de um objeto
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Métodos
    public void retirar (double valor) {
        this.saldo -= valor;
    }

    // Métodos
    public double verificarSaldo () {
        return this.saldo;
    }
}
