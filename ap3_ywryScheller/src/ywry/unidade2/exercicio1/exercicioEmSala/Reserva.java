package ywry.unidade2.exercicio1.exercicioEmSala;

public class Reserva {
    Passageiro passageiro;
    Assento assento;
    Viagem viagem;

    public Reserva(Passageiro passageiro, Assento assento, Viagem viagem) {
        this.passageiro = passageiro;
        this.assento = assento;
        this.viagem = viagem;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public void exibirInformacoes() {
        System.out.println(getPassageiro());
        System.out.println(getViagem());
        System.out.println(getAssento().numeroAssento);
    }

    @Override
    public String toString() {
        return "Reserva [passageiro=" + passageiro + ", assento=" + assento + ", viagem=" + viagem + "]";
    }

}
