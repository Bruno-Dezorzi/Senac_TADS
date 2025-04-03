package br.com.bruno_dezorzi.padroes.comportamentais.state;

public class VendendoState implements State {

  private MaquinaVenda maquinaVenda;

  public VendendoState(MaquinaVenda maquinaVenda) {
    this.maquinaVenda = maquinaVenda;
  }

  @Override
  public void inserirMoeda() {
    System.out.println("Aguarde.. estamos processando uma venda");
  }

  @Override
  public void ejetarMoeda() {
    System.out.println(
      "Estamos processando uma venda... não é possível ejetar"
    );
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("A lavanca já foi acionada");
  }

  @Override
  public void dispensarProduto() {
    System.out.println("Produto liberado");
    if (maquinaVenda.getQuantidade() > 0) {
      maquinaVenda.setEstado(maquinaVenda.getSemMoedaState());
    } else {
      System.out.println("Produto esgotado");
      maquinaVenda.setEstado(maquinaVenda.getSemEstoqueState());
    }
  }
}
