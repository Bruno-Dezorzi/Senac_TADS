package br.com.bruno_dezorzi.padroes.comportamentais.visitor;

public class Principal {

  public static void main(String[] args) {
    Livro livro1 = new Livro(50.0, "Padrões de Projeto");
    Livro livro2 = new Livro(30.0, "PG em Java");

    Fruta fruta1 = new Fruta("Banana", 10.0, 2.5);
    Fruta fruta2 = new Fruta("Melancia", 20.0, 3.0);

    Visitante visitante = new VisitanteCarrinhoDeCompras();

    livro1.aceitar(visitante);
    livro2.aceitar(visitante);

    fruta1.aceitar(visitante);
    fruta2.aceitar(visitante);
  }
}
