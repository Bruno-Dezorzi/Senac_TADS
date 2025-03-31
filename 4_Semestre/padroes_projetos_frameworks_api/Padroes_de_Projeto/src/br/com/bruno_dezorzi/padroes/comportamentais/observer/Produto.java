package br.com.bruno_dezorzi.padroes.comportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Sujeito {

  private String nome;
  private int quantidade;
  private List<Observer> observadores;

  public Produto(String nome, int quantidade) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.observadores = new ArrayList<>();
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
    notificarObservadores();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public List<Observer> getObservadores() {
    return observadores;
  }

  public void setObservadores(List<Observer> observadores) {
    this.observadores = observadores;
  }

  @Override
  public void adicionarObservador(Observer observador) {
    observadores.add(observador);
  }

  @Override
  public void removerObservador(Observer observador) {
    observadores.remove(observador);
  }

  @Override
  public void notificarObservadores() {
    for (Observer observador : observadores) {
      observador.atualizar(nome, quantidade);
    }
  }
}
