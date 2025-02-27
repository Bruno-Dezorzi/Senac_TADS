package br.com.bruno_dezorzi.antipadroes.estruturais.adapter;

public class SistemaDePagamento {

  private boolean usarSistemanovo;
  private PagamentoAntigo pagamentoAntigo = new PagamentoAntigo();
  private PagamentoNovo pagamentoNovo = new PagamentoNovo();

  public SistemaDePagamento(boolean usarSistemanovo) {
    this.usarSistemanovo = usarSistemanovo;
  }

  public void realizarPagamento(double valor) {
    if (usarSistemanovo) {
      System.out.println("Convertendo valor para sistema novo");
      pagamentoNovo.pagar(valor);
    } else {
      pagamentoAntigo.processarPagamento(valor);
    }
  }
}
