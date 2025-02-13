/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.testes.TimeJogador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP Victus
 */
public class Time {
    private List<Jogador> jogadores;

    
    
    public Time(){
        this.jogadores = new ArrayList<>();
    }
    
   

    
   public void adicionarJogador(Jogador jogador){
       if(jogadores.size() < 11){
           jogadores.add(jogador);
       }
       else{
           System.out.println("O time já tem 11 jogadores. Substitua um jogador para adicionar outro ou remova");
       }
   }
   
   public void substituirJogador(int numero, Jogador reserva){
       for(int i = 0; i < jogadores.size(); i++){
           if(jogadores.get(i).getNumero() == numero){
               jogadores.set(i,reserva);
               System.out.println("Jogador substituido");
               return;
           }
           System.out.println("Jogador com numero " + numero + "Não encontrado" );
       }

   }
   
   public void consultarJogadores(){
       for(Jogador jogador : jogadores){
           System.out.println(jogador);
   }
       
   }
    
}
