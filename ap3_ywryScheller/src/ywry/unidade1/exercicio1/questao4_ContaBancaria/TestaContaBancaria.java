package ywry.unidade1.exercicio1.questao4_ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(8755, "usuario1");
        ContaBancaria conta2 = new ContaBancaria(7355, "usuario2");
        ContaBancaria conta3 = new ContaBancaria(9855, "usuario3");
        System.out.println(conta1.verificarSaldo());
        conta1.depostiarSaldo(2000);
        System.out.println(conta1.verificarSaldo());
        conta1.retirarSaldo(500);
        System.out.println(conta1.verificarSaldo());
        System.out.println(conta2);
        System.out.println(conta3);
    }
}
