package br.com.bruno_dezorzi.padroes.comportamentais.observer;

public interface Sujeito {
  void adicionarObservador(Observer observador);

  void removerObservador(Observer observador);

  void notificarObservadores();
}
