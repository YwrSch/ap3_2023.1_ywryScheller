package ywry.unidade3.exercicio1.exercicio2_Threads;

import java.util.Random;

public class ContadorComThreads implements Runnable {

    private String nome;

    public ContadorComThreads(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getNome() + ": " + i);
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
