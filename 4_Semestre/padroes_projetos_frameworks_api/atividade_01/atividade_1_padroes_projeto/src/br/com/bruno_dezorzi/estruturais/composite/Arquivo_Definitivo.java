package br.com.bruno_dezorzi.estruturais.composite;

public class Arquivo_Definitivo implements Arquivo{

    private String nome;
    private Double tamanho;

    public Arquivo_Definitivo(String nome, Double tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }


    
    

}
