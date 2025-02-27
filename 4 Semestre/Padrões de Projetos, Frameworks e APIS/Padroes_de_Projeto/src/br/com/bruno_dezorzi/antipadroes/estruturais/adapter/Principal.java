package br.com.bruno_dezorzi.antipadroes.estruturais.adapter;

public class Principal {

  public static void main(String[] args) {
    SistemaDePagamento sistemaAntigo = new SistemaDePagamento(false);
    sistemaAntigo.realizarPagamento(200);

    SistemaDePagamento sistemaNovo = new SistemaDePagamento(true);
    sistemaNovo.realizarPagamento(200);
  }
}
