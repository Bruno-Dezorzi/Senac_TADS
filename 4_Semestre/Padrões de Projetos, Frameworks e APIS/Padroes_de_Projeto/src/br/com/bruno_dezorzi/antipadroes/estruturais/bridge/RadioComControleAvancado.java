package br.com.bruno_dezorzi.antipadroes.estruturais.bridge;

public class RadioComControleAvancado {

  public void ligar() {
    System.out.println("Ligando o rádio");
  }

  public void desligar() {
    System.out.println("Desligando o rádio");
  }

  public void aumentarVolume() {
    System.out.println("Aumentando o volume do rádio");
  }

  public void sintonizarEstacao(double estacao) {
    System.out.println("Rádio sintonizada na estação " + estacao);
  }
}
