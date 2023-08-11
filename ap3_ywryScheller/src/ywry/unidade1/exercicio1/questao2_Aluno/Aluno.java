package ywry.unidade1.exercicio1.questao2_Aluno;

public class Aluno {

    String nome;
    int matricula;
    double notaUnidade1;
    double notaUnidade2;
    double notaUnidade3;

    public Aluno(String nome, int matricula, double notaUnidade1, double notaUnidade2, double notaUnidade3) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaUnidade1 = notaUnidade1;
        this.notaUnidade2 = notaUnidade2;
        this.notaUnidade3 = notaUnidade3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaUnidade1() {
        return notaUnidade1;
    }

    public void setNotaUnidade1(double notaUnidade1) {
        this.notaUnidade1 = notaUnidade1;
    }

    public double getNotaUnidade2() {
        return notaUnidade2;
    }

    public void setNotaUnidade2(double notaUnidade2) {
        this.notaUnidade2 = notaUnidade2;
    }

    public double getNotaUnidade3() {
        return notaUnidade3;
    }

    public void setNotaUnidade3(double notaUnidade3) {
        this.notaUnidade3 = notaUnidade3;
    }

    public double getMedia() {
        return (getNotaUnidade1() + getNotaUnidade2() + getNotaUnidade3()) / 3;
    }

    boolean isAprovado() {
        if (this.getMedia() >= 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notaUnidade1=" + notaUnidade1 + ", notaUnidade2="
                + notaUnidade2 + ", notaUnidade3=" + notaUnidade3 + ", media=" + getMedia() + "]";
    }

}
