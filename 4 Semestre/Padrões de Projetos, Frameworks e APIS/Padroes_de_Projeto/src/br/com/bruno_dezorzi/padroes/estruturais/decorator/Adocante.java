package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public class Adocante extends CafeDecorator {

  public Adocante(Cafe cafe) {
    super(cafe);
  }

  @Override
  public double getPreco() {
    return super.getPreco() + 1.50;
  }

  @Override
  public String getDescricao() {
    return super.getDescricao() + "com Adoçante";
  }
}
