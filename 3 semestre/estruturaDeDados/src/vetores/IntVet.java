/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetores;

/**
 *
 * @author alves.7924
 */
public class IntVet {
    //declarando atributos
    private int[] valores;
    
    //comportamentos
    //construtor --->  instanciar um objeto na memoria

    public IntVet(int quantidade) {
        valores = new int[quantidade];
    }
    
    //demais metodos
    
    public void adiciona(int valor){
        for(int i=0;i<valores.length;i++){
            if(valores[i] == 0){
                valores[i] = valor;
                break;
            }
        }
    }
    
    public boolean addNaPosicao(int valor, int posicao){  
     //verificar se o tamanho do vetor é maior que a quantidade de 
     //elementos
     if(contaValor()<valores.length){//tem espaço
         for(int i = contaValor();i>posicao;i--){
            valores[i]=valores[i-1];
         }
         valores[posicao] = valor;
         return true;
     }
     return false;
    }
    
    public void removerValor(int posicao){
        for(int i = posicao;i<=contaValor();i++){
            if(valores.length - 1 == i){
                break;
            }
            valores[i] = valores[i+1];
        }
        valores[valores.length-1] = 0;
    }
    public int qtElementos(){
        return valores.length;
    }
    public int contaValor(){
        int qtd = 0;
        for(int i=0;i<valores.length;i++){
            if(valores[i] != 0){
                qtd++;
            }
        }
        return qtd;   
    }
    public void mostraValores(){
        for(int i=0;i<valores.length;i++){
            System.out.print(valores[i]+", ");
            
        }
    }
    public void aumentaCapacidade(int novaCapacidade){
        if(novaCapacidade<valores.length){
           int[] valoresMaior = new int[novaCapacidade];
           for(int i=0;i<valores.length;i++){
               valoresMaior[i]=valores[i];
           }
        }
    }
    //busca sequencial
    public int busca(int valor){
        for(int i=0;i<contaValor();i++){
            if(valores[i]==valor){
                return i; //encontrou o valor
            }
        }
        return -1;
    }
    
    public int buscaBinaria(int valor){
        int inicio = 0;
        int fim = contaValor()-1;
        int meio = 0;
        ordenaBubbleSortOtimizado();
        while(inicio<=fim){
            meio = (inicio+fim)/2;
            if(valores[meio]==valor){
                return meio;
            }else{
                if (valores[meio]<valor){
                    inicio = meio + 1;
                }else{
                    fim = meio-1;
                }
            }
        }
        
        return -1;//não encontrou
    }
    
    public void ordenaBubbleSort(){
        int qtd = contaValor();
        int aux;
        for(int j = 0;j < qtd -1; j++){
            for(int i =0; i<qtd-1-i;i++){
                if(valores[i]>valores[i+1]){
                    aux = valores[i];
                    valores[i] = valores[i+1];
                    valores[i+1]=aux;
                }
            }
        }
    }
    
     public void ordenaBubbleSortOtimizadoDoWhile(){
        int qtd = contaValor();
        int aux;
        int j = 0;
        boolean troca;
        do{
            troca = false;
            for(int i =0; i<qtd-1-i;i++){
                if(valores[i]>valores[i+1]){
                    aux = valores[i];
                    valores[i] = valores[i+1];
                    valores[i+1]=aux;
                    troca = true;
                }
            }
            j++;
        }while(troca && j<qtd-1);
    }
    
    public void ordenaBubbleSortOtimizado(){
        int qtd = contaValor();
        int aux;
        boolean troca;
        for(int j=0;j<qtd-1;j++){
            troca = false;
            for(int i =0; i<qtd-1-j;i++){
                if(valores[i]>valores[i+1]){
                    aux = valores[i];
                    valores[i] = valores[i+1];
                    valores[i+1]=aux;
                    troca = true;
                }
            }
            //se não fizer nenhuma troca o vetor já está ordenado
            if (!troca){
                break;
            }
        }
    } 
     
}
