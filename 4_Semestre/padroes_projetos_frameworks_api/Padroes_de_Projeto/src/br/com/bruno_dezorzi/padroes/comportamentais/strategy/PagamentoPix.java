package br.com.bruno_dezorzi.padroes.comportamentais.strategy;

public class PagamentoPix implements PagamentoStrategy {

  private String chavePix;

  public PagamentoPix(String chavePix) {
    this.chavePix = chavePix;
  }

  @Override
  public void pagar(double valor) {
    System.out.println(
      "Pagamento de R$ " + valor + " realizado com pix " + chavePix
    );
  }
}
