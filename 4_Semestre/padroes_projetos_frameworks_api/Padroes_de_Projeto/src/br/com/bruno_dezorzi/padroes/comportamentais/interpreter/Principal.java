package br.com.bruno_dezorzi.padroes.comportamentais.interpreter;

public class Principal {

  public static void main(String[] args) {
    Expressao expressao1 = Interpretador.construiExpressao("20 + 5");
    System.out.println(expressao1.interpretar());

    Expressao expressao2 = Interpretador.construiExpressao("20 - 5");
    System.out.println(expressao2.interpretar());
  }
}
