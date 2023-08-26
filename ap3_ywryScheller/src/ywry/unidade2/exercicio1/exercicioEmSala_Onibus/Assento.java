package ywry.unidade2.exercicio1.exercicioEmSala_Onibus;

public class Assento {
    int numeroAssento;
    boolean disponivel;
    Tipo tipo;

    public Assento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
        this.disponivel = true;
        if (numeroAssento % 2 == 1) {
            this.tipo = Tipo.janela;
        } else {
            this.tipo = Tipo.corredor;
        }
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
        return "\nAssento [numeroAssento=" + numeroAssento + ", disponivel=" + disponivel + ", tipo=" + tipo + "]";
    }

}
