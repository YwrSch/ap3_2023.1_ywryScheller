package ywry.unidade2.exercicio1.questao1_Curso;

import java.util.ArrayList;
import ywry.unidade1.exercicio1.questao2_Aluno.Aluno;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private ArrayList<Aluno> alunosCadastrados;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.alunosCadastrados = new ArrayList<Aluno>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public void setAlunosCadastrados(ArrayList<Aluno> alunosCadastrados) {
        this.alunosCadastrados = alunosCadastrados;
    }

    public void registrarAluno(Aluno aluno){
        getAlunosCadastrados().add(aluno);
    }

    @Override
    public String toString() {
        return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", cargaHoraria=" + cargaHoraria
                + ", alunosCadastrados=" + alunosCadastrados + "]";
    }

}
