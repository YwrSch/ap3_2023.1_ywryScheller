package ywry.unidade2.exercicio1.questao4_Escola;

public class Endereco {
    private String cidade;
    private int logradouro;
    private String cep;

    public Endereco(String cidade, int logradouro, String cep) {
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(int logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco [cidade=" + cidade + ", logradouro=" + logradouro + ", cep=" + cep + "]";
    }

}
