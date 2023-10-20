package ywry.unidade3.exercicio1.exercicio1_Exceptions;

public class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso, saldo restante: " + getSaldo());
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor >= 0) {
            setSaldo(getSaldo() + valor);
        } else {
            throw new IllegalArgumentException();
        }
    }

}
