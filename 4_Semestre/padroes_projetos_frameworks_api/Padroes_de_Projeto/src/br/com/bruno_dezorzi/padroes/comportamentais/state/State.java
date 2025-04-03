package br.com.bruno_dezorzi.padroes.comportamentais.state;

public interface State {
  void inserirMoeda();

  void ejetarMoeda();

  void acionarAlavanca();

  void dispensarProduto();
}
