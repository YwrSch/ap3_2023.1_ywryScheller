package ywry.unidade1.exercicio3.questao1_Pessoa;

public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome.toUpperCase() + "]";
    }

}
