/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.Lista_Duplamente_Ligada;

/**
 *
 * @author HP Victus
 */
public class Nod<T> {
    private T elemento;
    private Nod<T> proximo;
    private Nod<T> anterior;
    
    public Nod(T elemento){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nod<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nod<T> proximo) {
        this.proximo = proximo;
    }

    public Nod<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nod<T> anterior) {
        this.anterior = anterior;
    }
    
    
}
