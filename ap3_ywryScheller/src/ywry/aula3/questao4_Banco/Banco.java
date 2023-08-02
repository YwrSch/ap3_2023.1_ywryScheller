// Código secreto: 10092781470
package ywry.aula3.questao4_Banco;

import java.util.LinkedList;
import ywry.aula2.questao4_ContaBancaria.ContaBancaria;

public class Banco {
    String nome;
    LinkedList<ContaBancaria> contas = new LinkedList<ContaBancaria>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(LinkedList<ContaBancaria> contas) {
        this.contas = contas;
    }

    void adicionarConta(ContaBancaria c) {
        getContas().add(c);
    }

    void removerConta(ContaBancaria c) {
        getContas().remove(c);
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", contas=" + contas + "]";
    }

}
