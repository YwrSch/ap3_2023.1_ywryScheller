package ywry.unidade2.exercicio2.questao1_Veiculo;

public class Moto extends Veiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String descrever() {
        return super.descrever() + "\nCilindrada: " + getCilindrada();
    }
}
