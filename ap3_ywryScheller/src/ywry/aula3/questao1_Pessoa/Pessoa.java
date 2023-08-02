// Código secreto: 10092781470
package ywry.aula3.questao1_Pessoa;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    void fazerAniversario() {
        setIdade(getIdade()+1);
        System.out.println("Feliz aniversário! Agora você tem "+getIdade()+" anos.");
    }

    boolean ehMaiorDeIdade() {
        if(getIdade()>=18){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pessoa [nome: " + nome + ", " + idade + " anos de idade, " + altura + " metros de altura]";
    }

    
}
