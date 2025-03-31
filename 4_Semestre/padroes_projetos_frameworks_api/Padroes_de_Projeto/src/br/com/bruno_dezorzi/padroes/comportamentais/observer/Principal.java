package br.com.bruno_dezorzi.padroes.comportamentais.observer;

public class Principal {

  public static void main(String[] args) {
    Produto produto = new Produto("Samgung", 25);

    Cliente cliente1 = new Cliente("Alice");
    Cliente cliente2 = new Cliente("Patricia");

    produto.adicionarObservador(cliente1);
    produto.adicionarObservador(cliente2);

    produto.setQuantidade(10);
    produto.setQuantidade(0);

    produto.removerObservador(cliente2);
    produto.setQuantidade(15);
  }
}
