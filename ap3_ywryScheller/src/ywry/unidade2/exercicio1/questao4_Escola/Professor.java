package ywry.unidade2.exercicio1.questao4_Escola;

import java.time.LocalDate;
import ywry.unidade2.exercicio1.questao1_Curso.Disciplina;

public class Professor {
    private String nome;
    private LocalDate dataNascimento;
    private Disciplina disciplina;

    public Professor(String nome, LocalDate dataNascimento, Disciplina disciplina) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", dataNascimento=" + dataNascimento + ", disciplina=" + disciplina + "]";
    }
}
