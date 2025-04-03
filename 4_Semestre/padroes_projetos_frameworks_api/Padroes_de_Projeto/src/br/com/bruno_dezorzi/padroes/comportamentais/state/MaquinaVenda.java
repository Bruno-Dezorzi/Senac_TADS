package br.com.bruno_dezorzi.padroes.comportamentais.state;

public class MaquinaVenda {

  private State semMoedaState;
  private State comMoedaState;
  private State vendendoState;
  private State semEstoqueState;

  private State estadoAtual;
  private int quantidade;

  public MaquinaVenda(int quantidade) {
    semMoedaState = new SemMoedaState(this);
    comMoedaState = new ComMoedaState(this);
    vendendoState = new VendendoState(this);
    semEstoqueState = new SemEstoqueState(this);

    this.quantidade = quantidade;
    if (quantidade > 0) {
      estadoAtual = semMoedaState;
    } else {
      estadoAtual = semEstoqueState;
    }
  }

  public void inserirMoeda() {
    estadoAtual.inserirMoeda();
  }

  public void ejetarMoeda() {
    estadoAtual.ejetarMoeda();
  }

  public void acionarAlavanca() {
    estadoAtual.acionarAlavanca();
    estadoAtual.dispensarProduto();
  }

  public void liberarProduto() {
    if (quantidade > 0) {
      System.out.println("Um produto foi dispensado");
      quantidade--;
    }
  }

  public void setEstado(State novoState) {
    estadoAtual = novoState;
  }
}
