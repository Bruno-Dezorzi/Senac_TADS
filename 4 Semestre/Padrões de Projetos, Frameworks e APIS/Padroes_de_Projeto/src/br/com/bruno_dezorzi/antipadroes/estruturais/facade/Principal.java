package br.com.bruno_dezorzi.antipadroes.estruturais.facade;

public class Principal {

  public static void main(String[] args) {
    Amplificador amplificador = new Amplificador();
    amplificador.ligar();
    amplificador.ajustarVolume(10);

    Projetor projetor = new Projetor();
    projetor.ligar();
    projetor.ajustarFonte("HDMI");

    Player player = new Player();
    player.ligar();
    player.reproduzirFilme("O Senhor dos Pastéis: o Retorno do Queijo");

    System.out.println("Filme Iniciado");
  }
}
