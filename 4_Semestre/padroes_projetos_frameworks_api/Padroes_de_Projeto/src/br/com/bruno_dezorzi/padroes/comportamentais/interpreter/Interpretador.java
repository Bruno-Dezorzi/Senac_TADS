package br.com.bruno_dezorzi.padroes.comportamentais.interpreter;

public class Interpretador {

  public static Expressao construiExpressao(String expressao) {
    String[] partes = expressao.split(" ");
    Expressao esquerda = new Numero(Integer.parseInt(partes[0]));
    String operador = partes[1];
    Expressao direita = new Numero(Integer.parseInt(partes[2]));

    return switch (operador) {
      case "+" -> new Soma(esquerda, direita);
      case "-" -> new Subtracao(esquerda, direita);
      default -> throw new IllegalArgumentException(
        "Operador desconhecido: " + operador
      );
    };
  }
}
