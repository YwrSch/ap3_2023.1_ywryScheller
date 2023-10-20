package ywry.unidade3.exercicio1.exercicio2_Threads;

public class TestaContador {
    public static void main(String[] args) throws InterruptedException {
        Thread c1 = new Thread(new ContadorComThreads("Contador 1"));
        Thread c2 = new Thread(new ContadorComThreads("Contador 2"));
        c1.start();
        c2.start();
    }
}
