/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoloiane;

/**
 *
 * @author HP Victus
 */
public class ListaEncadeada<T> {
    
    private No<T> inicio;
    private int tamanho = 0;
    
//    public void adiciona(T elemento){
//        No no = new No<>(elemento);
//        this.inicio = no;
//        this.tamanho++;
//          
//    }
    
    public void inserirFinal(T elemento){
        No no = new No<>(elemento);
        if(this.inicio == null){
            this.inicio = no;
            this.tamanho++;
        } 
        else{
            No atual = this.inicio;
            while(atual.getElemento() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            this.tamanho++;
        }
    }
    
    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }
    
    
    
}
