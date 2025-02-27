package br.com.bruno_dezorzi.padroes.estruturais.bridge;

public class Radio implements Dispositivo {

  @Override
  public void ligar() {
    System.out.println("Ligando o Rádio");
  }

  @Override
  public void desligar() {
    System.out.println("Desligando o Rádio");
  }

  @Override
  public void aumentarVolume() {
    System.out.println("Aumentando o volume do Rádio");
  }
}
