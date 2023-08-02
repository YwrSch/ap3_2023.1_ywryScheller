// Código secreto: 10092781470
package ywry.aula3.questao4_Banco;

import ywry.aula2.questao4_ContaBancaria.ContaBancaria;

public class TestaBanco {
    public static void main(String[] args) {
        Banco b = new Banco();
        b.setNome("Banco1");
        for (int i = 0; i < 30; i++) {
            ContaBancaria c = new ContaBancaria(i + 1, "Pessoa_" + Integer.toString(i + 1));
            b.adicionarConta(c);
        }
        System.out.println(b);
        ContaBancaria c = b.getContas().getLast();
        b.removerConta(c);
        System.out.println(b);
    }
}
