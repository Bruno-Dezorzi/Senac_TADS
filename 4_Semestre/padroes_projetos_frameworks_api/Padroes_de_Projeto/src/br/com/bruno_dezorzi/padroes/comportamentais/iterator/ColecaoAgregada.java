package br.com.bruno_dezorzi.padroes.comportamentais.iterator;

public interface ColecaoAgregada<T> {
  Iterador<T> criarIterador();
}
