package br.com.banco;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {

        // Não deixar sacar enquanto não tem saldo

        Conta contaCorrente = new Conta();
        Conta poupanca = new Conta();
        Scanner input = new Scanner(System.in);

            System.out.println("Segue a lista de atividades possíveis no sistema\n " +
                    "1 - Depositar dinheiro\n " +
                    "2 - Sacar dinheiro\n " +
                    "3 - Verificar saldo\n ");
            System.out.println("Qual das operações gostaria de fazer?\n ");
            Integer operacao = input.nextInt();

            if (operacao.equals(1)) {
                System.out.println("Em qual de suas contas?\n " +
                        "1 - Conta Poupança\n " +
                        "2 - Conta Corrente\n ");
                Integer escolha1 = input.nextInt();
                if (escolha1.equals(1)) {
                    System.out.println("Você gostaria de depositar quanto em sua conta Poupança?\n ");
                    double depositoPoupanca = input.nextInt();
                    poupanca.depositar(depositoPoupanca);
                    System.out.println("Saldo em conta poupança " + poupanca.verificarSaldo());
                } else {
                    System.out.println("Você gostaria de depositar quanto em sua conta corrente?\n ");
                    double depositoCorrente = input.nextInt();
                    contaCorrente.depositar(depositoCorrente);
                    System.out.println("Saldo em conta corrente " + contaCorrente.verificarSaldo());
                }
            } else if (operacao.equals(2)) {
                System.out.println("Em qual de suas contas?\n " +
                        "1 - Conta Poupança\n " +
                        "2 - Conta Corrente\n ");
                Integer escolha2 = input.nextInt();
                if (escolha2.equals(1)) {
                    System.out.println("Quanto você quer sacar de sua conta Poupança?");
                    double saquePoupanca = input.nextInt();
                    if (saquePoupanca > poupanca.saldo) {
                        System.out.println("Você não tem dinheiro suficiente para sacar, a seguir seu saldo" + poupanca.verificarSaldo());
                    } else {
                        poupanca.retirar(saquePoupanca);
                        System.out.println("Você acaba de sacar " + saquePoupanca);
                        System.out.println("Sua conta ficou com " + poupanca.verificarSaldo());
                    }
                } else {
                    System.out.println("Quanto você quer sacar na conta Corrente?");
                    double saqueCorrente = input.nextInt();
                    if (saqueCorrente > poupanca.saldo) {
                        System.out.println("Você não tem dinheiro suficiente para sacar, a seguir seu saldo " + contaCorrente.verificarSaldo());
                    } else {
                        contaCorrente.retirar(saqueCorrente);
                        System.out.println("Você acaba de sacar " + saqueCorrente);
                        System.out.println("Sua conta ficou com " + contaCorrente.verificarSaldo());
                    }
                }
            }
        }
    }
