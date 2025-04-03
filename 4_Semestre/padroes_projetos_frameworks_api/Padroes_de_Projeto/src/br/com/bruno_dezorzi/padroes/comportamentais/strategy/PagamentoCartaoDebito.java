package br.com.bruno_dezorzi.padroes.comportamentais.strategy;

public class PagamentoCartaoDebito implements PagamentoStrategy {

  private String numeroCartao;
  private String nomeBanco;
  private String numeroConta;
  private String nomeTitular;

  public PagamentoCartaoDebito(
    String numeroCartao,
    String nomeBanco,
    String numeroConta,
    String nomeTitular
  ) {
    this.numeroCartao = numeroCartao;
    this.nomeBanco = nomeBanco;
    this.numeroConta = numeroConta;
    this.nomeTitular = nomeTitular;
  }

  @Override
  public void pagar(double valor) {
    System.out.println(
      "Pagamento de R$ " + valor + " realizado com cartao de debito"
    );
  }
}
