package ywry.unidade1.exercicio3.questao5_Time;

import java.util.Scanner;

public class TestaTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ensira o nome do 1º time: ");
        Time t1 = new Time(sc.next());
        System.out.print("Ensira o nome do 2º time: ");
        Time t2 = new Time(sc.next());
        System.out.println("Ensira os jogadores do time '" + t1.getNomeTime() + "'");
        for (int i = 0; i < 11; i++) {
            System.out.println((i + 1) + "º jogador");
            t1.cadastrarJogador();
        }
        System.out.println("Ensira os jogadores do time '" + t2.getNomeTime() + "'");
        for (int i = 0; i < 11; i++) {
            System.out.println((i + 1) + "º jogador");
            t2.cadastrarJogador();
        }
        System.out.println("Time: " + t1.getNomeTime());
        t1.listarJogadores();
        System.out.println("Time: " + t2.getNomeTime());
        t2.listarJogadores();
        sc.close();
    }
}
