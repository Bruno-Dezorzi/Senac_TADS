package br.com.bruno_dezorzi.padroes.estruturais.facade;

public class HomeTheater {

  private Amplificador amplificador;
  private Projetor projetor;
  private Player player;

  public HomeTheater(
    Amplificador amplificador,
    Projetor projetor,
    Player player
  ) {
    this.amplificador = amplificador;
    this.projetor = projetor;
    this.player = player;
  }

  public Amplificador getAmplificador() {
    return amplificador;
  }

  public void setAmplificador(Amplificador amplificador) {
    this.amplificador = amplificador;
  }

  public Projetor getProjetor() {
    return projetor;
  }

  public void setProjetor(Projetor projetor) {
    this.projetor = projetor;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public void assistirFilme(String filme) {
    System.out.println("Preparando o sistema Home Theater");
    amplificador.ligar();
    amplificador.ajustarVolume(10);
    projetor.ligar();
    projetor.ajustarFonte("HDMI");
    player.ligar();
    player.reproduzirFilme(filme);
    System.out.println("Filme Iniciado");
  }
}
