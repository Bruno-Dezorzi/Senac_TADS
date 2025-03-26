package br.com.bruno_dezorzi.padroes.estruturais.bridge;

public class Principal {

  public static void main(String[] args) {
    Dispositivo tv = new Televisao();
    Dispositivo radio = new Radio();

    ControleRemotoBasico controleRemotoBasico = new ControleRemotoBasico(tv);
    ControleRemotoAvancado controleRemotoAvancado = new ControleRemotoAvancado(radio);

    controleRemotoBasico.ligar();
    controleRemotoBasico.aumentarVolume();

    controleRemotoAvancado.ligar();
    controleRemotoAvancado.aumentarVolume();
    controleRemotoAvancado.silenciar();
  }
}
