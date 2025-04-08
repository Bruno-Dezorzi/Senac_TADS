package br.com.bruno_dezorzi.padroes.comportamentais.visitor;

public class Livro implements Item {

  private String titulo;
  private double preco;

  public Livro(double preco, String titulo) {
    this.preco = preco;
    this.titulo = titulo;
  }

  @Override
  public void aceitar(Visitante visitante) {
    visitante.visitar(this);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }
}
