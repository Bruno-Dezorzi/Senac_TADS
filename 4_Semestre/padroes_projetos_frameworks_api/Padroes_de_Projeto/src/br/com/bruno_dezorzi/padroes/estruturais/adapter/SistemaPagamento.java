package br.com.bruno_dezorzi.padroes.estruturais.adapter;

public class SistemaPagamento {

  private Pagamento metooPagamento;

  public SistemaPagamento(Pagamento pagamento) {
    this.metooPagamento = pagamento;
  }

  public void realizarPagamento(double valor) {
    metooPagamento.pagar(valor);
  }
}
