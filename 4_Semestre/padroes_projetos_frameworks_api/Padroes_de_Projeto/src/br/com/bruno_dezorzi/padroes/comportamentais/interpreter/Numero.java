package br.com.bruno_dezorzi.padroes.comportamentais.interpreter;

public class Numero implements Expressao {

  private int numero;

  public Numero(int numero) {
    this.numero = numero;
  }

  @Override
  public int interpretar() {
    return numero;
  }
}
