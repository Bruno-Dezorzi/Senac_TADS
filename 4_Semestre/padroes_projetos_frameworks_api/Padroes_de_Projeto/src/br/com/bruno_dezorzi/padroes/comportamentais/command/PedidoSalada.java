package br.com.bruno_dezorzi.padroes.comportamentais.command;

public class PedidoSalada implements Pedido {

  private Cozinheiro cozinheiro;

  public PedidoSalada(Cozinheiro cozinheiro) {
    this.cozinheiro = cozinheiro;
  }

  @Override
  public void executar() {
    cozinheiro.fazerSalada();
  }
}
