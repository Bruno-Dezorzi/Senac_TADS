package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public abstract class CafeDecorator implements Cafe {

  protected Cafe cafe;

  public CafeDecorator(Cafe cafe) {
    this.cafe = cafe;
  }

  @Override
  public double getPreco() {
    return 1.00;
  }

  @Override
  public String getDescricao() {
    return "Café ";
  }
}
