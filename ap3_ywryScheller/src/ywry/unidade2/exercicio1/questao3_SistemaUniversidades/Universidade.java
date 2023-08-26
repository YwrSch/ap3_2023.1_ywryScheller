package ywry.unidade2.exercicio1.questao3_SistemaUniversidades;

import java.util.ArrayList;
import ywry.unidade2.exercicio1.questao1_Curso.Curso;

public class Universidade {

    public Universidade(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }

    private String nome;
    private ArrayList<Curso> cursos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void registrarCurso(Curso curso){
        getCursos().add(curso);
    }

    @Override
    public String toString() {
        return "Universidade [nome=" + nome + ", cursos=" + cursos + "]";
    }
}
