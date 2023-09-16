package ywry.unidade2.exercicio2.questao2_Animal;

public class TestaAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Jorginho", 5);
        Gato g = new Gato("Fagundis", 4);
        System.out.println(c.emitirSom());
        System.out.println(g.emitirSom());
    }
}
