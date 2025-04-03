package br.com.bruno_dezorzi.padroes.comportamentais.strategy;

public class Principal {

  public static void main(String[] args) {
    CarrinhoCompras carrinho = new CarrinhoCompras();

    carrinho.setEstrategiaPagamento(new PagamentoCartaoCredito(null, "GHui"));
  }
}
