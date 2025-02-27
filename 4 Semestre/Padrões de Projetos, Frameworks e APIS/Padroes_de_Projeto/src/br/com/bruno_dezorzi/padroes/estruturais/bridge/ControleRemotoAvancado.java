package br.com.bruno_dezorzi.padroes.estruturais.bridge;

public class ControleRemotoAvancado extends ControleRemoto {

  public ControleRemotoAvancado(Dispositivo dispositivo) {
    super(dispositivo);
  }

  public void silenciar() {
    System.out.println("Silenciar dispositivo");
  }
}
