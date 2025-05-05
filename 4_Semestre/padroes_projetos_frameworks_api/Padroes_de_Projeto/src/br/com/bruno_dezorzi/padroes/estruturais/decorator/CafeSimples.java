package br.com.bruno_dezorzi.padroes.estruturais.decorator;

public class CafeSimples extends CafeDecorator {

  public CafeSimples(Cafe cafe) {
    super(cafe);
  }

  @Override
  public double getPreco() {
    return super.getPreco();
  }

  @Override
  public String getDescricao() {
    return super.getDescricao() + "simples";
  }

  @Override
  public void derrubar(){
    super.derrubar();
  }
}
