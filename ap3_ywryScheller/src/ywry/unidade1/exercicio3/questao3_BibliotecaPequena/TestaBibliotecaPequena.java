package ywry.unidade1.exercicio3.questao3_BibliotecaPequena;

import java.util.Scanner;

public class TestaBibliotecaPequena {
    public static void main(String[] args) {
        BibliotecaPequena b = new BibliotecaPequena("Biblioteca1");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < b.getLivros().length; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º número: ");
            b.getLivros()[i] = sc.nextLine();
        }
        b.listarLivros();
        sc.close();
    }
}
