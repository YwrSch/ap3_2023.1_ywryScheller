package ywry.aula2.questao3_Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", 2008);
        Carro carro2 = new Carro("Chevrolet", "Carro", 2022);
        System.out.println(carro1);
        System.out.println(carro1.isSemiNovo());
        System.out.println(carro2);
        System.out.println(carro2.isSemiNovo());
    }
}
