package br.com.bruno_dezorzi.padroes.comportamentais.state;

public class SemEstoqueState implements State {

  public SemEstoqueState(MaquinaVenda maquinaVenda) {}

  @Override
  public void inserirMoeda() {
    System.out.println("Produto esgotado, não é possível inserir moeda");
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Nenhuma moeda foi inserida");
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Produto esgotado");
  }

  @Override
  public void dispensarProduto() {
    System.out.println("Nenhum produto dispensado");
  }
}
