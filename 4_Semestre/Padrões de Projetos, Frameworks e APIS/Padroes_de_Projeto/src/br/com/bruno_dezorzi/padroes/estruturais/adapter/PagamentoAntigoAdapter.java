package br.com.bruno_dezorzi.padroes.estruturais.adapter;

public class PagamentoAntigoAdapter implements Pagamento {

  private PagamentoAntigo pagamentoAntigo = new PagamentoAntigo();

  @Override
  public void pagar(double valor) {
    pagamentoAntigo.processarPagamento(valor);
  }
}
