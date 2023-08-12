package ywry.unidade1.exercicio3.questao5_Time;

import java.util.ArrayList;
import java.util.Scanner;

public class Time {
    private String nomeTime;
    private ArrayList<Jogador> jogadores;

    public Time(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<Jogador>(11);
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public void cadastrarJogador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do jogador: ");
        String nome = sc.next();
        System.out.print("Informe a idade do jogador: ");
        int idade = sc.nextInt();
        System.out.print("Informe a altura do jogador em metros: ");
        float altura = sc.nextFloat();
        getJogadores().add(new Jogador(nome, altura, idade));
        sc.close();
    }

    public void listarJogadores() {
        System.out.println("Lista de jogadores:");
        for (int i = 0; i < getJogadores().size(); i++) {
            System.out.println(getJogadores().get(i));
        }
    }

}
