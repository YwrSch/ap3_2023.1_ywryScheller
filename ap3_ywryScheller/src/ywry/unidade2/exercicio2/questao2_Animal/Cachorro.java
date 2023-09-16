package ywry.unidade2.exercicio2.questao2_Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public String latir() {
        return "Au au";
    }

    public String emitirSom() {
        return super.emitirSom() + " " + latir();
    }
}
