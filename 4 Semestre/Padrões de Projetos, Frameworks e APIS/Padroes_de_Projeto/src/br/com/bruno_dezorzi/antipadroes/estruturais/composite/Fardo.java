package br.com.bruno_dezorzi.antipadroes.estruturais.composite;

public class Fardo {

  private String nome;
  private Caixa caixa;
  private int quantidade;

  public Fardo(String nome, Caixa caixa, int quantidade) {
    this.nome = nome;
    this.caixa = caixa;
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return caixa.getPreco() * quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Caixa getCaixa() {
    return caixa;
  }

  public void setCaixa(Caixa caixa) {
    this.caixa = caixa;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
