package br.com.brunodezorzi.poo.agosto.exercicio5;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarInformacoes(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publição: " + anoPublicacao);

    }
}
