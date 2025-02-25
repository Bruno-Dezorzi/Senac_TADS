package br.com.bruno_dezorzi.antipadroes.prototype;

public class Documento {
    public String titulo;
    public String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public void exibir() {
        System.out.println("Titutlo " + titulo);
        System.out.println("Conteudo " + conteudo);
    }

    public Documento clonar() {
        return this;
    }
}
