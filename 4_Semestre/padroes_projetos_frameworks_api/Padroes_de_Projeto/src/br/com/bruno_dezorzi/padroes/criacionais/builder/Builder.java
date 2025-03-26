package br.com.bruno_dezorzi.padroes.criacionais.builder;

public class Builder {

  String parede;
  String telhado;
  int portas;
  int janelas;
  int piscina;

  public Builder comParedes(String parede) {
    this.parede = parede;
    return this;
  }

  public Builder comTelhado(String telhado) {
    this.telhado = telhado;
    return this;
  }

  public Builder comPortas(int portas) {
    this.portas = portas;
    return this;
  }

  public Builder comJanelas(int janelas) {
    this.janelas = janelas;
    return this;
  }

  public Builder comPiscina(int piscina) {
    this.piscina = piscina;
    return this;
  }

  public Casa build() {
    return new Casa(parede, telhado, portas, janelas, piscina);
  }
}
