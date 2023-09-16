package ywry.unidade2.exercicio2.questao1_Veiculo;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String descrever() {
        return super.descrever() + "\nNumero de portas: " + getNumeroPortas();
    }
}
