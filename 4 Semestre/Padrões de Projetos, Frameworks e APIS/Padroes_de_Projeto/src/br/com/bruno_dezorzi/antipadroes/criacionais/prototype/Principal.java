package br.com.bruno_dezorzi.antipadroes.criacionais.prototype;

public class Principal {

  public static void main(String[] args) {
    Documento doc1 = new Documento("Relatório", "Meu relatório de TI");
    Documento doc2 = doc1.clonar();

    doc2.titulo = "Novo Relatório";

    doc2.exibir();

    doc1.exibir();
  }
}
