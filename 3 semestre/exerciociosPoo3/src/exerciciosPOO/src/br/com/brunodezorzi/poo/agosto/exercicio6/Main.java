package br.com.brunodezorzi.poo.agosto.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício 6:");
        System.out.println();

        Scanner leiaNumero = new Scanner(System.in); // Corrigido para System.in

        System.out.println("Digite um número para conhecer a tabuada dele (um número maior que 1):");
        int numero = leiaNumero.nextInt();

        if (numero <= 1){
            while (numero <= 1) {
            System.out.println("Digite um número maior que 1:");
            numero = leiaNumero.nextInt();
            }
        }


        Tabuada tabuada = new Tabuada();
        tabuada.setNumero(numero);
        tabuada.mostrarTabuada(); // Chama o método para mostrar a tabuada
    }
}
