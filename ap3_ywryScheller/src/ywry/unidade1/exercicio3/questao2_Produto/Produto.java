package ywry.unidade1.exercicio3.questao2_Produto;

public class Produto {
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirDescricao() {
        System.out.println(getDescricao());
    }

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + "]";
    }

}
