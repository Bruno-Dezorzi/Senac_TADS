/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import vetores.IntVet;

/**
 *
 * @author alves.7924
 */
public class TestaIntVet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntVet vetor;
        vetor = new IntVet(10);
        vetor.adiciona(500);
        vetor.adiciona(202);
        vetor.adiciona(1);
        vetor.adiciona(100);
        vetor.adiciona(3);
        
     //  vetor.ordenaBubbleSort();
       // vetor.ordenaBubbleSortOtimizado();
       // vetor.mostraValores();
        int resp = vetor.buscaBinaria(3);
        if (resp > -1){
            System.out.println("O valor está na posicao "+resp);
        }else{
            System.out.println("valor não encontrado");
        }
       
    }
    
}
