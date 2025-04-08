package br.com.bruno_dezorzi.padroes.comportamentais.visitor;

public interface Visitante {
  void visitar(Livro livro);

  void visitar(Fruta fruta);
}
