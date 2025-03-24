/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.Lista_Encadeada;

import lista.Lista_Encadeada.ListaEncadeada;

/**
 *
 * @author 10253
 */
public class TestaListaEncadeada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaNoFinal(1);
        lista.adicionaNoFinal(95);
        lista.adicionaNoFinal(2);
        lista.adicionaNoFinal(3);
        
        lista.exibirLista(); // exibir os elementos
        
        lista.adicionaNoInicio(8); // adiciona no começo
        
        lista.exibirLista(); // exibir os elementos
        
        System.out.println(lista.buscarPosicao(95)); // buscara a qual no o elemento está
        
        lista.removerInicio();
        
        System.out.println(lista.tamanhoLista()); // exibir a quantidade
       
        lista.exibirLista(); // exibir os elementos
        
       
        
        System.out.println(lista.ultimoElemento()); // busca o ultimo elemento
        
        System.out.println(lista.primeiroElemento()); // busca o primeiro elemento
        
        lista.adicionaNoFinal(90); // adiciona um elemento no final
        
        lista.exibirLista(); // exibir os elementos
        
        lista.adicionar(40, 2);
        
        lista.exibirLista(); // exibir os elementos
        
        lista.remover(2);
        
        lista.exibirLista(); // exibir os elementos
        
        
    }
    
}
