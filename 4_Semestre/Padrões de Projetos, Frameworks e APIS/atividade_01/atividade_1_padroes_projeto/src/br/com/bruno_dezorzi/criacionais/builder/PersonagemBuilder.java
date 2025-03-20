package br.com.bruno_dezorzi.criacionais.builder;

import java.util.ArrayList;
import java.util.List;

public class PersonagemBuilder {

  private String nome;
  private String classe;
  private List<String> armas = new ArrayList<>();
  private List<String> habilidades = new ArrayList<>();

  public PersonagemBuilder setNome(String nome) {
    this.nome = nome;
    return this;
  }

  public PersonagemBuilder setClasse(String classe) {
    this.classe = classe;
    return this;
  }

  public PersonagemBuilder adicionarArma(String arma) {
    this.armas.add(arma);
    return this;
  }

  public PersonagemBuilder adicionarHabilidades(String habilidade) {
    this.habilidades.add(habilidade);
    return this;
  }
}
