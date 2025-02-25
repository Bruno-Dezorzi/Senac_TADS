package br.com.bruno_dezorzi.padroes.criacionais.builder;

public class Casa {

  private String parede;
  private String telhado;
  private int portas;
  private int janelas;
  private int piscina;

  public Casa(
    String parede,
    String telhado,
    int portas,
    int janelas,
    int piscina
  ) {
    this.parede = parede;
    this.telhado = telhado;
    this.portas = portas;
    this.janelas = janelas;
    this.piscina = piscina;
  }

  public String getParede() {
    return parede;
  }

  public void setParede(String parede) {
    this.parede = parede;
  }

  public String getTelhado() {
    return telhado;
  }

  public void setTelhado(String telhado) {
    this.telhado = telhado;
  }

  public int getPortas() {
    return portas;
  }

  public void setPortas(int portas) {
    this.portas = portas;
  }

  public int getJanelas() {
    return janelas;
  }

  public void setJanelas(int janelas) {
    this.janelas = janelas;
  }

  public void mostrarDetalhes() {
    System.out.println(
      "Casa com " +
      parede +
      ", " +
      telhado +
      ", " +
      "Janelas: " +
      janelas +
      ", Portas: " +
      portas +
      ", Piscinas: " +
      piscina
    );
  }

  public Casa(Builder builder) {
    this.parede = builder.parede;
    this.telhado = builder.telhado;
    this.janelas = builder.janelas;
    this.portas = builder.portas;
    this.piscina = builder.piscina;
  }
}
