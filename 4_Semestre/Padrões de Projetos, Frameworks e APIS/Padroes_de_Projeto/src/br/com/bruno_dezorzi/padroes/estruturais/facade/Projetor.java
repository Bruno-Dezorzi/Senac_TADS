package br.com.bruno_dezorzi.padroes.estruturais.facade;

public class Projetor {

  void ligar() {
    System.out.println("Projetor ligado");
  }

  void ajustarFonte(String fonte) {
    System.out.println("Fonte ajustada para  " + fonte);
  }
}
