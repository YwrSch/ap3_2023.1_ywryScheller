package ywry.unidade2.exercicio1.questao2_Empresa;

import ywry.unidade1.exercicio2.questao3_Funcionario.Funcionario;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa e = new Empresa("TMT");
        e.adcionarFuncionario(new Funcionario("Ywry", "Empregado", 5));
        System.out.println(e.calcularTotalSalarios());
        e.adcionarFuncionario(new Funcionario("Ywry2", "Empregado", 3));
        System.out.println(e.calcularTotalSalarios());
    }
}
