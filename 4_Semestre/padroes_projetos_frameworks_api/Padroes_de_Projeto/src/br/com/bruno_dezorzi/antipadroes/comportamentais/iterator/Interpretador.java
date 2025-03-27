package br.com.bruno_dezorzi.antipadroes.comportamentais.iterator;

public class Interpretador {

  public int interpretar(String expressao) {
    String[] partes = expressao.split(" ");
    int num1 = Integer.parseInt(partes[0]);
    String operador = partes[1];
    int num2 = Integer.parseInt(partes[2]);

    switch (operador) {
      case "+" -> {
        return num1 + num2;
      }
      case "-" -> {
        return num1 - num2;
      }
      default -> throw new IllegalArgumentException(
        "Operador desconhecido " + operador
      );
    }
  }
}
