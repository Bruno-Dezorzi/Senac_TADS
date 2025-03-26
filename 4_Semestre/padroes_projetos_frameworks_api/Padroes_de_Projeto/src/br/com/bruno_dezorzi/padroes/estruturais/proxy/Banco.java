package br.com.bruno_dezorzi.padroes.estruturais.proxy;

public class Banco implements ServicoBanco {

  @Override
  public void processarPagamento(String cliente, double valor) {
    System.out.println(
      "Banco: Pagamento de R$" + valor + "processado para " + cliente
    );
  }
}
