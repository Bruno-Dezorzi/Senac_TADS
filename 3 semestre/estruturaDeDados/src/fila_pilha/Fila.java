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
public class Fila<T> {
    private ListaEncadeada<T> fila;

    public Fila() {
    }
    
    public void enqueue(T elemento){
        fila.adicionaNoFinal(elemento);
    }
    
    public void dequeue(){
        fila.removerInicio();
    }
    
    
}
