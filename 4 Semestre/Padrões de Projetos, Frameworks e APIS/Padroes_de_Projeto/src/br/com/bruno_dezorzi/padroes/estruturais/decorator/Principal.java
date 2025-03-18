package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public class Principal {

  public static void main(String[] args) {
    Cafe cafeSimples = new CafeSimples();
    System.out.println(
      cafeSimples.getDescricao() + "= R$ " + cafeSimples.getPreco()
    );
  }
}
