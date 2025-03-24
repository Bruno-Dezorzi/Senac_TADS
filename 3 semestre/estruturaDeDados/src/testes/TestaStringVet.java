/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import vetores.StringVet;

/**
 *
 * @author alves.7924
 */
public class TestaStringVet {
    public static void main(String[] args) {
        StringVet vetor = new StringVet(3);
        
        
        vetor.adiciona("oi");
        vetor.adiciona("tudo");
        vetor.adiciona("bem");
        
        vetor.mostraValores();
        
        vetor.addNaPosicao("ta",1);
        vetor.mostraValores();
    }
}
