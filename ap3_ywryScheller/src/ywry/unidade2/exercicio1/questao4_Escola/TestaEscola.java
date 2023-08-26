package ywry.unidade2.exercicio1.questao4_Escola;

import java.time.LocalDate;
import ywry.unidade2.exercicio1.questao1_Curso.Disciplina;

public class TestaEscola {
    public static void main(String[] args) {
        Escola e = new Escola("UFERSA", new Endereco("Angicos", 34434, "234234-323"));
        e.contratarProfessor(new Professor("professor", LocalDate.of(1997, 2, 5), new Disciplina("Cálculo", 60)), new Disciplina("Calculo III", 30));
        e.contratarProfessor(new Professor("professor2", LocalDate.of(1997, 2, 5), new Disciplina("Cálculo", 60)), new Disciplina("Física", 30));
        e.listarProfessores();
    }
}
