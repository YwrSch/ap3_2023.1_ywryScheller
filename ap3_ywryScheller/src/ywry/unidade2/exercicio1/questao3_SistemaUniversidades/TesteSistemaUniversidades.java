package ywry.unidade2.exercicio1.questao3_SistemaUniversidades;

import ywry.unidade1.exercicio1.questao2_Aluno.Aluno;
import ywry.unidade2.exercicio1.questao1_Curso.Curso;
import ywry.unidade2.exercicio1.questao1_Curso.Disciplina;

public class TesteSistemaUniversidades {
    public static void main(String[] args) {
        SistemaUniversidades sUniversidades = new SistemaUniversidades();
        sUniversidades.registrarUniversidade(new Universidade("Ufersa"));
        sUniversidades.getUniversidades().get(0).registrarCurso(new Curso("BSI"));
        sUniversidades.getUniversidades().get(0).getCursos().get(0).registrarDiciplina(new Disciplina("AP3", 60));
        sUniversidades.getUniversidades().get(0).getCursos().get(0).getDisciplinas().get(0).registrarAluno(new Aluno("Ywry", 123, 10, 10, 10));
        System.out.println(sUniversidades.encontrarUniversidadeComMaisAlunos());
        sUniversidades.registrarUniversidade(new Universidade("Ufersa2"));
        sUniversidades.getUniversidades().get(1).registrarCurso(new Curso("BSI"));
        sUniversidades.getUniversidades().get(1).getCursos().get(0).registrarDiciplina(new Disciplina("AP3", 60));
        sUniversidades.getUniversidades().get(1).getCursos().get(0).getDisciplinas().get(0).registrarAluno(new Aluno("Ywry", 123, 10, 10, 10));
        sUniversidades.getUniversidades().get(1).getCursos().get(0).getDisciplinas().get(0).registrarAluno(new Aluno("Ywry", 123, 10, 10, 10));
        System.out.println(sUniversidades.encontrarUniversidadeComMaisAlunos());
        sUniversidades.getUniversidades().get(0).registrarCurso(new Curso("LCI"));
        sUniversidades.getUniversidades().get(0).getCursos().get(1).registrarDiciplina(new Disciplina("AP3", 60));
        sUniversidades.getUniversidades().get(0).getCursos().get(1).getDisciplinas().get(0).registrarAluno(new Aluno("Ywry", 123, 10, 10, 10));
        sUniversidades.getUniversidades().get(0).getCursos().get(1).getDisciplinas().get(0).registrarAluno(new Aluno("Ywry", 123, 10, 10, 10));
        System.out.println(sUniversidades.encontrarUniversidadeComMaisAlunos());
    }
}
