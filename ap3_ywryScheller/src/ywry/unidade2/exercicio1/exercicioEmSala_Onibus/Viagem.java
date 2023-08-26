package ywry.unidade2.exercicio1.exercicioEmSala_Onibus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Viagem {
    int numeroViagem;
    String origem;
    String destino;
    LocalDateTime dataHoraPartida;
    LocalDateTime dataHoraChegada;
    ArrayList<Assento> assentos;

    public Viagem(int numeroViagem, String origem, String destino, LocalDateTime dataHoraPartida,
            LocalDateTime dataHoraChegada) {
        this.numeroViagem = numeroViagem;
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.dataHoraChegada = dataHoraChegada;
        this.assentos = new ArrayList<Assento>(40);
        for (int i = 1; i <= 40; i++) {
            assentos.add(new Assento(i));
        }

    }

    public int getNumeroViagem() {
        return numeroViagem;
    }

    public void setNumeroViagem(int numeroViagem) {
        this.numeroViagem = numeroViagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(LocalDateTime dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public LocalDateTime getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public ArrayList<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<Assento> assentos) {
        this.assentos = assentos;
    }

    public void assentosDisponiveis() {
        System.out.println("Assentos disponíveis: ");
        for (int i = 0; i < getAssentos().size(); i++) {
            if (getAssentos().get(i).isDisponivel()) {
                System.out.println(getAssentos().get(i).getNumeroAssento());
            }
        }
    }

    public void reservarAssento(int assentoSelecionado) {
        for (int i = 0; i < getAssentos().size(); i++) {
            if (assentoSelecionado == getAssentos().get(i).getNumeroAssento()) {
                if (getAssentos().get(i).isDisponivel()) {
                    getAssentos().get(i).setDisponivel(false);
                    System.out.println(
                            "Reserva realizada para o assento número " + assentoSelecionado);
                } else {
                    System.out.println("Assento indisponível");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Viagem [numeroViagem=" + numeroViagem + ", origem=" + origem + ", destino=" + destino
                + ", dataHoraPartida=" + dataHoraPartida + ", dataHoraChegada=" + dataHoraChegada + ", assentos="
                + assentos + "]";
    }

}
