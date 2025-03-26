package br.com.bruno_dezorzi.padroes.criacionais.prototype;

public class Documento implements Cloneable {

    private String titulo;
    private String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", conteudo=" + conteudo + "]";
    }

    @Override
    public Documento clone() {
        return new Documento(this.titulo, this.conteudo);
    }
}
