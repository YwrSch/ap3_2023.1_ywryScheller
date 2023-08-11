package ywry.unidade1.exercicio1.questao4_ContaBancaria;

public class ContaBancaria {

    int numeroConta;
    String nomeTitular;
    double saldoConta;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double verificarSaldo() {
        return this.saldoConta;
    }

    public void depostiarSaldo(double valor) {
        this.saldoConta += valor;
    }

    public void retirarSaldo(double valor) {
        if (valor <= this.saldoConta) {
            this.saldoConta -= valor;
        } else {
            System.out.println("Operação inválida, retirada maior que o saldo bancário!");
        }

    }

    @Override
    public String toString() {
        return "ContaBancaria [numeroConta=" + numeroConta + ", nomeTitular=" + nomeTitular + ", saldoConta="
                + saldoConta + "]";
    }

}
