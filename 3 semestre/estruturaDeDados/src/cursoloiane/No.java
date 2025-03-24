/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoloiane;

/**
 *
 * @author HP Victus
 */
public class No<T> {
    private T elemento;
    private No<T> proximo;
    
    public No() {
    }

    public No(T elemento, No<T> próximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> próximo) {
        this.proximo = próximo;
    }
    
    

    
}
