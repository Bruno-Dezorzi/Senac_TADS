package br.com.bruno_dezorzi.antipadroes.estruturais.composite;

public class Principal {

  public static void main(String[] args) {
    Produto cerveja = new Produto("Cerveja 350ml", 3.99);
    Caixa caixa = new Caixa("Caixa de Cerveja", cerveja, 12);
    Fardo fardo = new Fardo("Fardo de Cerveja", caixa, 24);

    double Total = fardo.getPreco();

    System.out.println("O valor é: " + Total);
  }
}
