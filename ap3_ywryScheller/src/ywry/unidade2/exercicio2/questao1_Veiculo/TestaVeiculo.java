package ywry.unidade2.exercicio2.questao1_Veiculo;

public class TestaVeiculo {
    public static void main(String[] args) {
        Carro c = new Carro("Marca genérica de carro", "Modelo Generico de carro", 2022, 3);
        System.out.println(c.descrever());
        Moto m = new Moto("Marca genérica de moto", "Modelo Generico de moto", 2022, 66);
        System.out.println(m.descrever());
    }
}
