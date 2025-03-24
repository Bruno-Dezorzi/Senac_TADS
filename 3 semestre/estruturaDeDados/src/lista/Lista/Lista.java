/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.Lista;

import lista.Lista_Encadeada.No;


public class Lista<T> {
    private No<T> inicio;
    private No<T> fim;

    public Lista() {
    }
    
    public Lista(T elemento){
        this.inicio = new No<>(elemento);
        this.fim = this.inicio;
    }
    
    public void adiciona(T elemento){
        No<T> no = new No<>(elemento);
        if(this.inicio==null){
            this.inicio = no;
            this.fim = this.inicio;
        }else{
            this.fim.setProximo(no);
            this.fim = no;
        }
    }        
    
    
}
