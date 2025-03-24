/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author 10253
 */
public class VetorGenerico<T> {

    private T[] elementos;

    public VetorGenerico(int quantidade, Class<T> tipoClasse) {
        elementos = (T[]) new Object[quantidade];
    }

    public void adiciona(T elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                break;
            }
        }
    }

    public void adiciona(int posicao, T elemento) {
        //falta implementar
    }

    public int contaElementos() {
        int conta = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null) {
                conta++;
            } else {
                break;
            }
        }
        return conta;
    }

    public void removerValor(int posicao) {
        for (int i = posicao; i <= contaElementos(); i++) {
            if (elementos.length - 1 == i) {
                break;
            }
            elementos[i] = elementos[i + 1];
        }
        elementos[elementos.length - 1] = null;
    }
    
    public boolean aumentaCapacidade(int novaCapacidade){
        if(novaCapacidade>elementos.length){
           T[] elementosMaior = (T[]) new Object[novaCapacidade];
           for(int i=0;i<elementos.length;i++){
               elementosMaior[i] = elementos[i];
           }
        elementos = elementosMaior;
        return true;
        }
    return false;
    }
}
