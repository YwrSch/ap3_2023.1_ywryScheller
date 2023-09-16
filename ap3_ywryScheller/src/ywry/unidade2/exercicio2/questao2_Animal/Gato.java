package ywry.unidade2.exercicio2.questao2_Animal;

public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public String miar(){
        return "Miau";
    }

    public String emitirSom(){
        return super.emitirSom()+" "+miar();
    }
    
}
