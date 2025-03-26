package br.com.bruno_dezorzi.criacionais.builder;

import java.util.List;

public class Personagem {
    private String nome;
    private String classe;
    private List<String> armas;
    private List<String> habilidades;

    public Personagem() {
    }

    public Personagem(String nome, String classe, List<String> armas, List<String> habilidades) {
        this.nome = nome;
        this.classe = classe;
        this.armas = armas;
        this.habilidades = habilidades;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getClasse() {
        return classe;
    }



    public void setClasse(String classe) {
        this.classe = classe;
    }



    public List<String> getArmas() {
        return armas;
    }



    public void setArmas(List<String> armas) {
        this.armas = armas;
    }



    public List<String> getHabilidades() {
        return habilidades;
    }



    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    

    @Override
    public String toString() {
        return "Personagem [nome=" + nome + ", classe=" + classe + ", armas=" + armas + ", habilidades=" + habilidades
                + "]";
    }
    


    
}
