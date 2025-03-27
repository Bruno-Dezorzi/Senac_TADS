package br.com.bruno_dezorzi.antipadroes.comportamentais.command;

public class Garcom {

  private Cozinheiro cozinheiro = new Cozinheiro();

  public Garcom() {}

  public Garcom(Cozinheiro cozinheiro) {
    this.cozinheiro = cozinheiro;
  }

  public void fazerPedido(String pedido) {
    if (pedido.equals("pizza")) {
      cozinheiro.fazerPizza();
    } else if (pedido.equals("hamburguer")) {
      cozinheiro.fazerHamburguer();
    } else if (pedido.equals("salada")) {
      cozinheiro.fazerSalada();
    } else {
      System.out.println("Garçom: Pedido desconhecido");
    }
  }
}
