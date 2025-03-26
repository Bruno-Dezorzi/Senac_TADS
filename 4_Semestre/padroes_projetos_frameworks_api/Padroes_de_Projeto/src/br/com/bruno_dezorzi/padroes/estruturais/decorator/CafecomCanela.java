package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public class CafecomCanela extends CafeDecorator {

  public CafecomCanela(Cafe cafe) {
    super(cafe);
  }

  @Override
  public double getPreco() {
    return super.getPreco() + 2.00;
  }

  @Override
  public String getDescricao() {
    return super.getDescricao() + "com Canela";
  }
}
