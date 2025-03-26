package br.com.bruno_dezorzi.padroes.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Embalagem implements Item {

  private String nome;
  private List<Item> itens = new ArrayList<>();

  public Embalagem(String nome) {
    this.nome = nome;
  }

  @Override
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public double getPreco() {
    double total = 0;
    for (Item item : itens) {
      total += item.getPreco();
    }
    return total;
  }


  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }

  public void adicionarItem(Item item) {
    itens.add(item);
  }

  public void listarItens() {
    System.out.println(String.format("%s contém:", nome));
    for (Item item : itens) {
      System.out.println(
        String.format("- %s / R$%.2f", item.getNome(), item.getPreco())
      );
    }
  }
}
