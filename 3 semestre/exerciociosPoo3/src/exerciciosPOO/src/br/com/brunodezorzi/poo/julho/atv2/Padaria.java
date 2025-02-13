package br.com.brunodezorzi.poo.julho.atv2;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
    private List<Bolo> bolos;
    private List<Pao> paes;

    public Padaria() {
        this.bolos = new ArrayList<>();
        this.paes = new ArrayList<>();
    }

    public void adicionarBolo(Bolo bolo){
        bolos.add(bolo);

    }

    public void adicionarPaes(Pao pao){
        paes.add(pao);
    }

    public void relatorioBolos(){
        System.out.println("Bolos Disponíveis");
        for(int i = 0; i < bolos.size(); i++){
            System.out.println(bolos.get(i).toString());
        }
    }

    public void relatorioPaes(){
        System.out.println("Pães Disponíveis");
        for (int i = 0; i < paes.size(); i++){
            System.out.println(paes.get(i).toString());
        }
    }

}
