package br.com.bruno_dezorzi.padroes.estruturais.adapter;

public class Principal {

  public static void main(String[] args) {
    SistemaPagamento sistema1 = new SistemaPagamento(
      new PagamentoAntigoAdapter()
    );
    sistema1.realizarPagamento(200);

    SistemaPagamento sistema2 = new SistemaPagamento(
      new PagamentoNovoAdapter()
    );
    sistema2.realizarPagamento(500);
  }
}
