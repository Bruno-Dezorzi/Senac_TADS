package br.com.bruno_dezorzi.padroes.comportamentais.template_method;

public class Cha extends Bebida {

  @Override
  protected void adicionarIngredientePrincipal() {
    System.out.println("Adicionando saco de chá na agua quente");
  }

  @Override
  protected void adicionarCondimentos() {
    System.out.println("Adicionando limão");
  }
}
