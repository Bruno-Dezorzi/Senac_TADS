package br.com.bruno_dezorzi.padroes.estruturais.proxy;

public interface ServicoBanco {
  void processarPagamento(String cliente, double valor);
}
