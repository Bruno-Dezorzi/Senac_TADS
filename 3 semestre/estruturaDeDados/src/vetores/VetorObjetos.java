/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author alves.7924
 */
public class VetorObjetos {
    //declarando atributos
    private Object[] elementos;
    
    //comportamentos
    //construtor --->  instanciar um objeto na memoria

    public VetorObjetos(int quantidade) {
        elementos = new Object[quantidade];
    }
    
    //demais metodos
    
    public void adiciona(Object elemento){
        for(int i=0;i<elementos.length;i++){
            if(elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }
    
    public void addNaPosicao(Object elemento, int posicao){
        elementos[posicao] = elemento;
    }
    
    public void removerValor(int posicao){
        for(int i = posicao;i<=contaElementos();i++){
            if(elementos.length - 1 == i){break;}
                elementos[i] = elementos[i+1];
        }
        elementos[elementos.length-1] = null;
    }
    public int qtElementos(){
        return elementos.length;
    }
    public int contaElementos(){
        int qtd = 0;
        for(int i=0;i<elementos.length;i++){
            if(elementos[i] != null){
                qtd++;
            }
        }
        return qtd;
        
    }
    public void mostraValores(){
        for(int i=0;i<elementos.length;i++){
            System.out.print(elementos[i]+", ");
            
        }
    }
    public boolean aumentaCapacidade(int novaCapacidade){
        if(novaCapacidade>elementos.length){
           Object[] elementosMaior = new Object[novaCapacidade];
           for(int i=0;i<elementos.length;i++){
               elementosMaior[i] = elementos[i];
           }
        elementos = elementosMaior;
        return true;
        }
    return false;
    }
    
}
