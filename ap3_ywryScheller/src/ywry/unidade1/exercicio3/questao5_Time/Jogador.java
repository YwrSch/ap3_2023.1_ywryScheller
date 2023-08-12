package ywry.unidade1.exercicio3.questao5_Time;

import java.util.Random;

public class Jogador {
    private int codigo;
    private String nome;
    private float altura;
    private int idade;

    public Jogador(String nome, float altura, int idade) {
        Random rn = new Random();
        this.codigo = rn.nextInt(0, 99999);
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Idade: " + idade + ", Altura: " + altura + " metros.";
    }
}
