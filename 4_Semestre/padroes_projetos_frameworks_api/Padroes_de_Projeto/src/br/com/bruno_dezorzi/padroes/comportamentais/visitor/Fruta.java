package br.com.bruno_dezorzi.padroes.comportamentais.visitor;

public class Fruta implements Item {

  private String nome;
  private double preco;
  private double precoPorKg;

  public Fruta(String nome, double preco, double precoPorKg) {
    this.nome = nome;
    this.preco = preco;
    this.precoPorKg = precoPorKg;
  }

  @Override
  public void aceitar(Visitante visitante) {
    visitante.visitar(this);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPrecoPorKg() {
    return precoPorKg;
  }

  public void setPrecoPorKg(double precoPorKg) {
    this.precoPorKg = precoPorKg;
  }
}
