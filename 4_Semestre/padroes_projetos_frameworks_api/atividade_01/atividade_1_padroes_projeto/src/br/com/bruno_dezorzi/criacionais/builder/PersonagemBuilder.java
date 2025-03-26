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

  public PersonagemBuilder adicionarHabilidade(String habilidade) {
    this.habilidades.add(habilidade);
    return this;
  }

  public PersonagemBuilder adicionarArmas(List<String> armas) {
    this.armas.addAll(armas);
    return this;
  }

  public PersonagemBuilder adicionarHabilidades(List<String> habilidades) {
    this.habilidades.addAll(habilidades);
    return this;
  }

  public PersonagemBuilder magoSupremo(String nome, String classe) {
    this.nome = nome;
    this.classe = classe;
    this.armas.add("Cajado Supremo");
    this.habilidades.add("Bola de Fogo");
    this.habilidades.add("Relâmpago");
    this.habilidades.add("Nevasca");
    return this;
  }

  public Personagem build(){
    return new Personagem(nome,classe,armas,habilidades);
  }
}
