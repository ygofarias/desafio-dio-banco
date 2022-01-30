package com.digital.innovatione.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        Conta empresarial = new ContaEmpresarial();

        int sair;
        do {
            System.out.print("Digite o valor: ");
            double valor = sc.nextDouble();

            System.out.println();
            System.out.println("== Digite == ");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Transferir");
            int op = sc.nextInt();

            System.out.println();
            System.out.println("Conta para realizar a operação: ");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Conta Empresarial");
            int tipoConta = sc.nextInt();

            switch (op) {
                case 1:
                    if (tipoConta == 1) {
                        cc.sacar(valor);
                    } else if (tipoConta == 2) {
                        poupanca.sacar(valor);
                    } else {
                        empresarial.sacar(valor);
                    }
                case 2:
                    if (tipoConta == 1) {
                        cc.depositar(valor);
                    } else if (tipoConta == 2) {
                        poupanca.depositar(valor);
                    } else {
                        empresarial.depositar(valor);
                    }
                case 3:
                    if (tipoConta == 1) {
                        cc.transferir(valor, poupanca);
                    } else if (tipoConta == 2) {
                        poupanca.transferir(valor, empresarial);
                    } else {
                        empresarial.transferir(valor, cc);
                    }
                default:
                    System.out.println("Valores errados");
            }

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
            empresarial.imprimirExtrato();

            System.out.println();
            System.out.println("=== Deseja sair ===");
            System.out.println("0 - Sair");
            System.out.println("1 - Continuar");
            sair = sc.nextInt();



        } while (sair != 0);


    }
}
