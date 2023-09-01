package ywry.unidade2.exercicio1.questao4_Escola;

import java.util.ArrayList;

import ywry.unidade2.exercicio1.questao1_Curso.Disciplina;

public class Escola {
    private String nomeEscola;
    private Endereco endereco;
    private ArrayList<Professor> professores;

    public Escola(String nomeEscola, Endereco endereco) {
        this.nomeEscola = nomeEscola;
        this.endereco = endereco;
        this.professores = new ArrayList<Professor>();
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public void contratarProfessor(Professor professor, Disciplina disciplina){
        professor.setDisciplina(disciplina);
        getProfessores().add(professor);
    }

    public void listarProfessores(){
        System.out.println("Lista de Professores da escola '"+getNomeEscola()+"'");
        for (int i = 0; i < getProfessores().size(); i++) {
            System.out.println(getProfessores().get(i).getNome()+" | "+getProfessores().get(i).getDisciplina().getNomeDisciplina());
        }
    }

    @Override
    public String toString() {
        return "Escola [nomeEscola=" + nomeEscola + ", endereco=" + endereco + ", professores=" + professores + "]";
    }
}
