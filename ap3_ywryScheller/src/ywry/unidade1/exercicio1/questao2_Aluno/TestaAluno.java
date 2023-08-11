package ywry.unidade1.exercicio1.questao2_Aluno;

public class TestaAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ywry", 15879, 8.0, 9.0, 10.0);
        Aluno aluno2 = new Aluno("Ywky", 17879, 7.0, 8.0, 9.0);

        System.out.println(aluno1);
        System.out.println(aluno1.isAprovado() ? "Foi Aprovado" : "Foi Reprovado");
        System.out.println(aluno2);
        System.out.println(aluno2.isAprovado() ? "Foi Aprovado" : "Foi Reprovado");
    }
}
