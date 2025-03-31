package br.com.bruno_dezorzi.padroes.comportamentais.iterator;

public class Principal {

  public static void main(String[] args) {
    String[] nomes = { "Guilherme", "Matheus", "Roberta", "Maycon" };

    ColecaoDeNomes colecao = new ColecaoDeNomes(nomes);

    Iterador<String> iterador = colecao.criarIterador();

    while (iterador.temProximo()) {
      System.out.println(iterador.proximo());
    }
  }
}
