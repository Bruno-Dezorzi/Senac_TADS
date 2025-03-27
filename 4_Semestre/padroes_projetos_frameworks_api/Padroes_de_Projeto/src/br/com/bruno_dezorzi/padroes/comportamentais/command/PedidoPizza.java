package br.com.bruno_dezorzi.padroes.comportamentais.command;

public class PedidoPizza implements Pedido {

  Cozinheiro cozinheiro = new Cozinheiro();

  public PedidoPizza(Cozinheiro cozinheiro) {
    this.cozinheiro = cozinheiro;
  }

  @Override
  public void executar() {
    cozinheiro.fazerPizza();
  }
}
