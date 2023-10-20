package ywry.unidade3.exercicio1.exercicio1_Exceptions;

public class TestaBanco {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.setSaldo(1000);
        TransacaoBancaria t = new TransacaoBancaria();
        t.realizarTransacao(c, 2000);
        t.realizarTransacao(c, -1);
        
    }
}
