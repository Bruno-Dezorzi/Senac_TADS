package br.com.bruno_dezorzi.antipadroes.criacionais.factorymethod;

public class Caminhao extends Transporte {

  @Override
  public void entregar() {
    System.out.println("Entregando de caminhão");
  }
}
