package br.com.bruno_dezorzi.estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Diretorio implements Arquivo{

    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Arquivo> getItens() {
        return arquivos;
      }
    
      public void setItens(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
      }
    
      public void adicionarItem(Arquivo arquivo) {
        arquivos.add(arquivo);
      }

    @Override
    public Double getTamanho(){
        double total = 0;
        for (Arquivo arquivo : arquivos) {
        total += arquivo.getTamanho();
        }
        return total;
    }

    public void listarArquivos() {
        System.out.println(String.format("%s contém:", nome));
        for (Arquivo arquivo : arquivos) {
          System.out.println(
            String.format("- %s / %.2f MB", arquivo.getNome(), arquivo.getTamanho())
          );
        }
      }




}
