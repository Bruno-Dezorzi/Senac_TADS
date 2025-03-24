/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author alves.7924
 */
public class StringVet {
    private String[] palavras;

    public StringVet(int quantidade) {
         palavras = new String[quantidade];
    }
    
    public void adiciona(String string){
        for(int i=0;i<palavras.length;i++){
            if(palavras[i] == null){
                palavras[i] = string;
                break;
            }
        }
    }
    public void mostraValores(){
        for(int i=0;i<palavras.length;i++){
            System.out.println(palavras[i]);
        }
    }
    public void addNaPosicao(String string, int posicao){
        palavras[posicao] = string;
        }
    
    public int contaPalavras(){
        int qtde = 0;
        for(int i=0;i<palavras.length;i++){
            if(palavras[i] != null){
                qtde++;
            }
        }
    return qtde;
    }
    public void removerValor(int posicao){
        for(int i = posicao;i<=contaPalavras();i++){
            if(palavras.length - 1 == i){break;}
                palavras[i] = palavras[i+1];
        }
        palavras[palavras.length-1] = null;
    }
    public boolean aumentaCapacidade(int novaCapacidade){
        if(novaCapacidade>palavras.length){
            String[] palavrasMaior = new String[novaCapacidade];
            palavras = palavrasMaior;
            return true;
        }
    return false;
    }
    
    
}
