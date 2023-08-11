// Código secreto: 10092781470
package ywry.unidade1.exercicio2.questao2_Produto;

import java.util.ArrayList;

public class TestaProduto {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < 258; i++) {
            Produto p = new Produto();
            p.setNome("Produto_" + Integer.toString(i+1));
            p.setPreco(1.0);
            p.setQtdEstoque(0);
            produtos.add(p);
        }
        System.out.println(produtos);
        for (int i = 0; i < produtos.size(); i++) {
            produtos.get(i).adcionaEstoque();
        }
        System.out.println(produtos);
        System.out.println(produtos.get(0));
        produtos.get(0).removeEstoque();
        System.out.println(produtos.get(0));
        produtos.get(0).removeEstoque();
    }
}
