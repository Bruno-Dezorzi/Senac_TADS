package br.com.bruno_dezorzi.antipadroes.criacionais.factorymethod;

public class Principal {

  public static void main(String[] args) {
    Logistica logistica = new Logistica();

    logistica.planejarEntrega("caminhao");
    logistica.planejarEntrega("trem");
  }
}
