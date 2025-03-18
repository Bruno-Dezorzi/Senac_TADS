package br.com.bruno_dezorzi.antipadroes.proxy;

public class Cliente {

  public static void main(String[] args) {
    Banco banco = new Banco();
    banco.processarPagamento("João", 1500.00);
    banco.processarPagamento("Maria", 1200.00);
  }
}
