/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila_pilha;

import lista.Lista_Encadeada.ListaEncadeada;

/**
 *
 * @author HP Victus
 */
public class Pilha<T> {
    private ListaEncadeada<T> pilha;

    public Pilha() {
    }
    
    public void push(T elemento){
        pilha.adicionaNoFinal(elemento);
    }
    
    public void pop(){
        pilha.removerDoFim();
    }
    
}
