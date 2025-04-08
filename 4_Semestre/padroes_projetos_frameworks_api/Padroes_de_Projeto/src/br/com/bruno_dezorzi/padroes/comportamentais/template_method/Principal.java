package br.com.bruno_dezorzi.padroes.comportamentais.template_method;

public class Principal {

  public static void main(String[] args) {
    Bebida cha = new Cha();
    System.out.println("Preparando chá");
    cha.preparar();

    Bebida cafe = new Cafe();
    System.out.println("Preparando chá");
    cafe.preparar();
  }
}
