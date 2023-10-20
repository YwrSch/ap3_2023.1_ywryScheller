package ywry.unidade3.exercicio1.exercicio1_Exceptions;

import java.util.Scanner;

public class TransacaoBancaria {
    public void realizarTransacao(ContaBancaria conta, double valor) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Selecione a operação:\n1 - Sacar\n2 - Depositar");
            if (sc.nextInt() == 1) {
                conta.sacar(valor);
            } else {
                conta.depositar(valor);
            }
        } catch (SaldoInsuficienteException e1) {
            System.out.println("Saldo insuficiente");
        } catch (IllegalArgumentException e2) {
            System.out.println("Valor inválido");
            e2.printStackTrace();
        }
        sc.close();
    }
}
