package br.com.bruno_dezorzi.antipadroes.comportamentais.iterator;

public class Principal {

  public static void main(String[] args) {
    Interpretador interpretador = new Interpretador();

    System.out.println(interpretador.interpretar("10 + 5"));
    System.out.println(interpretador.interpretar("20 - 5"));
  }
}
