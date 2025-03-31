package br.com.bruno_dezorzi.padroes.comportamentais.iterator;

public interface Iterador<T> {
  boolean temProximo();

  T proximo();
}
