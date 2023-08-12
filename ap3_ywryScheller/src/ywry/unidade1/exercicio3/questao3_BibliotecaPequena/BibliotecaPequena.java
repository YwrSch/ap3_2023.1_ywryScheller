package ywry.unidade1.exercicio3.questao3_BibliotecaPequena;

public class BibliotecaPequena {
    private String nome;
    protected String[] livros;

    public BibliotecaPequena(String nome) {
        this.nome = nome;
        this.livros = new String[6];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getLivros() {
        return livros;
    }

    public void setLivros(String[] livros) {
        this.livros = livros;
    }

    public void listarLivros() {
        System.out.println("Lista de livros: ");
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i]);
        }
    }

}