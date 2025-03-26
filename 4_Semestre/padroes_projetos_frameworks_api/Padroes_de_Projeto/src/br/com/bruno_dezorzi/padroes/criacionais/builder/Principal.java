package br.com.bruno_dezorzi.padroes.criacionais.builder;

public class Principal {

  public static void main(String[] args) {
    Casa casaSimples = new Builder()
      .comParedes("Parede de Tijolo")
      .comJanelas(5)
      .comPortas(10)
      .comTelhado("Cerâmica")
      .build();

    Casa casaCompleta = new Builder()
      .comParedes("Parede de Tijolo")
      .comJanelas(5)
      .comPortas(10)
      .comTelhado("Cerâmica")
      .comPiscina(3)
      .build();

    casaSimples.mostrarDetalhes();

    casaCompleta.mostrarDetalhes();
  }
}
