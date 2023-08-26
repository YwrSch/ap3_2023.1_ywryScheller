package ywry.unidade2.exercicio1.questao2_Empresa;

import java.util.ArrayList;

import ywry.unidade1.exercicio2.questao3_Funcionario.Funcionario;

public class Empresa {
    private String nomeEmpresa;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adcionarFuncionario(Funcionario funcionario){
        getFuncionarios().add(funcionario);
    }

    public double calcularTotalSalarios(){
        double soma = 0;
        for (int i = 0; i < getFuncionarios().size(); i++) {
            soma += getFuncionarios().get(i).getSalario();
        }
        return soma;
    }

    @Override
    public String toString() {
        return "Empresa [nomeEmpresa=" + nomeEmpresa + ", funcionarios=" + funcionarios + "]";
    }
}
