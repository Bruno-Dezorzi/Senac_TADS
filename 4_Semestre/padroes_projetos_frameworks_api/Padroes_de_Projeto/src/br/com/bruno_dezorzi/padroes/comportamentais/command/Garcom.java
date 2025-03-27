package br.com.bruno_dezorzi.padroes.comportamentais.command;

public class Garcom {

  public void enviarPedido(Pedido pedido) {
    pedido.executar();
  }
}
