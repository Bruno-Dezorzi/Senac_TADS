package br.com.bruno_dezorzi.antipadroes.estruturais.composite;

public class Caixa {

  private String nome;
  private Produto produto;
  private int quantidade;

  public Caixa(String nome, Produto produto, int quantidade) {
    this.nome = nome;
    this.produto = produto;
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return produto.getPreco() * quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
