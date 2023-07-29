package ywry.aula2.questao3_Carro;

import java.time.Year;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String model, int ano) {
        this.marca = marca;
        this.modelo = model;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String model) {
        this.modelo = model;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    boolean isSemiNovo() {
        int anoAtual = Year.now().getValue();
        if (anoAtual - this.ano <= 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
    }
}
