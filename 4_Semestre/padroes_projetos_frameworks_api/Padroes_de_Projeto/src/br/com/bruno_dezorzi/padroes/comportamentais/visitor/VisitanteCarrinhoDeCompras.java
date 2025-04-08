package br.com.bruno_dezorzi.padroes.comportamentais.visitor;

public class VisitanteCarrinhoDeCompras implements Visitante {

  @Override
  public void visitar(Livro livro) {
    System.out.println(
      "Livro " + livro.getTitulo() + " custa " + livro.getPreco()
    );
  }

  @Override
  public void visitar(Fruta fruta) {
    double custo = fruta.getPreco() * fruta.getPrecoPorKg();
    System.out.println("Fruta " + fruta.getNome() + " custa " + custo);
  }
}
