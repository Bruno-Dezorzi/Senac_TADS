package br.com.bruno_dezorzi.antipadroes.estruturais.bridge;

public class TVComControleAvancado {

  public void ligar() {
    System.out.println("Ligando a TV");
  }

  public void desligar() {
    System.out.println("Desligando a TV");
  }

  public void aumentarVolume() {
    System.out.println("Aumentando o volume da TV");
  }

  public void mudarCanal(int canal) {
    System.out.println("TV mudou para o canal " + canal);
  }
}
