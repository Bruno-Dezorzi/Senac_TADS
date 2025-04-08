package br.com.bruno_dezorzi.padroes.comportamentais.template_method;

public class Cafe extends Bebida {

  @Override
  protected void adicionarIngredientePrincipal() {
    System.out.println("Adicioando pó de café na agua quente");
  }

  @Override
  protected void adicionarCondimentos() {
    System.out.println("Adicionando açucar");
  }
}
