package ywry.unidade2.exercicio1.exercicioEmSala;

public class Assento {
    int numeroAssento;
    boolean disponivel;
    Tipo tipo;

    public Assento(int numeroAssento, Tipo tipo) {
        this.numeroAssento = numeroAssento;
        this.disponivel = true;
        this.tipo = tipo;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Assento [numeroAssento=" + numeroAssento + ", disponivel=" + disponivel + ", tipo=" + tipo + "]";
    }

}
