package br.com.bruno_dezorzi.padroes.estruturais.bridge;

public abstract class ControleRemoto {

  protected Dispositivo dispositivo;

  public ControleRemoto(Dispositivo dispositivo) {
    this.dispositivo = dispositivo;
  }

  public void ligar() {
    dispositivo.ligar();
  }

  public void desligar() {
    dispositivo.desligar();
  }

  public void aumentarVolume() {
    dispositivo.aumentarVolume();
  }
}
