package br.com.bruno_dezorzi.padroes.comportamentais.template_method;

public abstract class Bebida {

  public final void preparar() {
    ferverAgua();
    adicionarIngredientePrincipal();
    adicionarCondimentos();
    servir();
  }

  private void ferverAgua() {
    System.out.println("Ferver água");
  }

  protected abstract void adicionarIngredientePrincipal();

  protected void adicionarCondimentos() {
    // pode ser redefinido na subclasse ou deixado vazio
  }

  private void servir() {
    System.out.println("Servindo bebida");
  }
}
