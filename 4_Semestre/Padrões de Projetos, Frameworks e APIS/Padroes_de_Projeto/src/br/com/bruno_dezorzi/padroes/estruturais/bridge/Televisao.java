package br.com.bruno_dezorzi.padroes.estruturais.bridge;

public class Televisao implements Dispositivo {

  @Override
  public void ligar() {
    System.out.println("Ligando a TV");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando a TV");
  }

  @Override
  public void aumentarVolume() {
    System.out.println("Aumentando o volume da TV");
  }
}
