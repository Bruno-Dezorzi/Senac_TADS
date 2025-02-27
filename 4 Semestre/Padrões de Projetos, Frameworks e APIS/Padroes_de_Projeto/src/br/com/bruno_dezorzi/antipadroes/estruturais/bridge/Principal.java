package br.com.bruno_dezorzi.antipadroes.estruturais.bridge;

public class Principal {

  public static void main(String[] args) {
    TVComControleBasico tvBasica = new TVComControleBasico();
    tvBasica.ligar();

    TVComControleAvancado tvAvancado = new TVComControleAvancado();
    tvAvancado.ligar();
  }
}
