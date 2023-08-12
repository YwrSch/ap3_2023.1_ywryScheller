package ywry.unidade1.exercicio3.questao4_Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Insira a marca do " + (i + 1) + "º carro: ");
            String marca = sc.next();
            System.out.print("Insira o modelo do " + (i + 1) + "º carro: ");
            String modelo = sc.next();
            System.out.print("Insira o ano do " + (i + 1) + "º carro: ");
            int ano = sc.nextInt();
            carros.add(new Carro(modelo, marca, ano));
        }
        System.out.println("Carros cadastrados:" + carros);
        sc.close();
    }
}
