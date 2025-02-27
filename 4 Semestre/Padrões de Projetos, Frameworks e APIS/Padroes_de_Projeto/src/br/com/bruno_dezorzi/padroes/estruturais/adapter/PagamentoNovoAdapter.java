package br.com.bruno_dezorzi.padroes.estruturais.adapter;

public class PagamentoNovoAdapter implements Pagamento {

  private PagamentoNovo pagamentoNovo = new PagamentoNovo();

  @Override
  public void pagar(double valor) {
    pagamentoNovo.pagar(valor);
  }
}
