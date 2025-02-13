/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.setembro.praticaEnum.exercicios2;

/**
 *
 * @author HP Victus
 */
public class Main {
    
    
    public void maiorPrioridade(Tarefa primeira_tarefa, Tarefa segunda_tarefa){
        if(primeira_tarefa.getPrioridade().getValor() > segunda_tarefa.getPrioridade().getValor()){
            System.out.println("A tarefa com maior prioridade é a " + primeira_tarefa.getPrioridade()); 
        }
        else{
            System.out.println("A tarefa com maior prioridade é a " + segunda_tarefa.getPrioridade());
        }
    }
    
    public static void main(String[] args) {
        
        Main main = new Main();
        
        
        Tarefa tarefa1 = new Tarefa(Prioridade.ALTA);
        Tarefa tarefa2 = new Tarefa(Prioridade.BAIXA);
        Tarefa tarefa3 = new Tarefa(Prioridade.URGENTE);
        
        main.maiorPrioridade(tarefa3, tarefa1);
    }
            
}
