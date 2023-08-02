// Código secreto: 10092781470
package ywry.aula3.questao2_Produto;

public class Produto {
    String nome;
    double preco;
    int qtdEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    void adcionaEstoque() {
        setQtdEstoque(getQtdEstoque() + 1);
    }

    void removeEstoque() {
        if (getQtdEstoque() > 0) {
            setQtdEstoque(getQtdEstoque() - 1);
        } else {
            System.out.println("O produto não possui estoque!");
        }
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco= R$" + preco + ", quantidade de estoque=" + qtdEstoque + "]";
    }
}
