package br.com.bruno_dezorzi.padroes.comportamentais.iterator;

public class ColecaoDeNomes implements ColecaoAgregada<String> {

  private String[] nomes;

  public ColecaoDeNomes(String[] nomes) {
    this.nomes = nomes;
  }

  @Override
  public Iterador<String> criarIterador() {
    return new IteradorDeNomes();
  }

  private class IteradorDeNomes implements Iterador<String> {

    private int indice = 0;

    @Override
    public boolean temProximo() {
      return indice < nomes.length;
    }

    @Override
    public String proximo() {
      if (temProximo()) {
        return nomes[indice++];
      }
      return null;
    }
  }
}
