package br.com.bruno_dezorzi.antipadroes.estruturais.proxy;

public class Banco {

  public void processarPagamento(String cliente, double valor) {
    System.out.println(
      "Banco: Processando pagamento de R$ " + valor + "de " + cliente
    );
  }
}
