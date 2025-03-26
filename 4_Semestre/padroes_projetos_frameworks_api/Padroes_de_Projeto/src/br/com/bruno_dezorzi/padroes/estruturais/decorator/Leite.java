package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public class Leite extends CafeDecorator {

  public Leite(Cafe cafe) {
    super(cafe);
  }

  @Override
  public double getPreco() {
    return super.getPreco() + 2.00;
  }

  @Override
  public String getDescricao() {
    return super.getDescricao() + "com Leite";
  }
}
