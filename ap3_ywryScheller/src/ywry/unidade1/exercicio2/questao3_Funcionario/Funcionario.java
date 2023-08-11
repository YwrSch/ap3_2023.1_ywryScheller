// Código secreto: 10092781470
package ywry.unidade1.exercicio2.questao3_Funcionario;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario= R$ " + salario + "]";
    }
}
