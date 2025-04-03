package br.com.bruno_dezorzi.padroes.comportamentais.strategy;

public class CarrinhoCompras {

  private PagamentoStrategy estrategiaPagamento;

  public void setEstrategiaPagamento(PagamentoStrategy estrategiaPagamento) {
    this.estrategiaPagamento = estrategiaPagamento;
  }

  public void pagar(double valor) {
    estrategiaPagamento.pagar(valor);
  }
}
