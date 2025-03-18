package br.com.bruno_dezorzi.antipadroes.estruturais.decorator;

public class Principal {

  public static void main(String[] args) {
    Cafe cafeSimples = new Cafe();
    System.out.println(
      cafeSimples.getDescricao() + " = R$ " + cafeSimples.getPreco()
    );

    Cafe cafeAcucar = new CafeComAcucar();
    System.out.println(
      cafeAcucar.getDescricao() + " = R$ " + cafeAcucar.getPreco()
    );

    Cafe cafeLeite = new CafeComLeite();
    System.out.println(
      cafeLeite.getDescricao() + " = R$ " + cafeLeite.getPreco()
    );
  }
}
