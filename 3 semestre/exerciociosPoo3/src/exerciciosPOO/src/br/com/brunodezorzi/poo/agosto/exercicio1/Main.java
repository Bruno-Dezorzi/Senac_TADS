package br.com.brunodezorzi.poo.agosto.exercicio1;

import br.com.brunodezorzi.poo.agosto.exercicio2.Aluno;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exércicio 1:");
        System.out.println();

        Carro carro = new Carro("Citroen", "C3", 2012);
        carro.mostrarInformacoes();
        System.out.println();
        // Novas informações para treinar set()

        carro.setMarca("Volkswagen");
        carro.setModelo("S10");
        carro.setAno(2020);
        carro.mostrarInformacoes();
        System.out.println();

    }




}
