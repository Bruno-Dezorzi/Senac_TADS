package br.com.bruno_dezorzi.padroes.estruturais.composite;

public class Principal {

  public static void main(String[] args) {
    Produto cerveja = new Produto("Cerveja 350ml", 3.99);

    Embalagem caixaCerveja = new Embalagem("Caixa Cerveja (12) unidades");
    for (int i = 0; i < 12; i++) {
      caixaCerveja.adicionarItem(cerveja);
    }

    Embalagem fardoCerveja = new Embalagem("Fardo Cerveja (24) caixa");
    for (int i = 0; i < 12; i++) {
      fardoCerveja.adicionarItem(caixaCerveja);
    }

    Embalagem carrinho = new Embalagem("Carrinho de Compra");
    carrinho.adicionarItem(cerveja);
    carrinho.adicionarItem(caixaCerveja);
    carrinho.adicionarItem(fardoCerveja);

    carrinho.listarItens();
    System.out.println(carrinho.getPreco());
  }
}
