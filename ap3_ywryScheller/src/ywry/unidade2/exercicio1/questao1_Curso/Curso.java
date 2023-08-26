package ywry.unidade2.exercicio1.questao1_Curso;

import java.util.ArrayList;

public class Curso {
    private String cursoNome;
    private ArrayList<Disciplina> disciplinas;

    public Curso(String cursoNome) {
        this.cursoNome = cursoNome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void registrarDiciplina(Disciplina disciplina){
        getDisciplinas().add(disciplina);
    }

    @Override
    public String toString() {
        return "Curso [cursoNome=" + cursoNome + ", disciplinas=" + disciplinas + "]";
    }
}
