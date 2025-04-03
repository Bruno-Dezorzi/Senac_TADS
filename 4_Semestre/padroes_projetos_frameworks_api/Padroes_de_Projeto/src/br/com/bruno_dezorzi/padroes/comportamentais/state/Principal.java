package br.com.bruno_dezorzi.padroes.comportamentais.state;

public class Principal {

  public static void main(String[] args) {
    MaquinaVenda maquinaVenda = new MaquinaVenda(2);

    maquinaVenda.acionarAlavanca();

    maquinaVenda.inserirMoeda();

    maquinaVenda.acionarAlavanca();

    maquinaVenda.inserirMoeda();

    maquinaVenda.ejetarMoeda();

    maquinaVenda.inserirMoeda();

    maquinaVenda.acionarAlavanca();
    maquinaVenda.inserirMoeda();
  }
}
