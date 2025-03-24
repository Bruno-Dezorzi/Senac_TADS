/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import modelo.Contato;
import vetores.VetorObjetos;

/**
 *
 * @author alves.7924
 */
public class TestaVetorObjeto {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);
        
        Contato c1 = new Contato("Luke Skywalker", "9999-9999");
        Contato c2 = new Contato("Darth Vader", "1111-1111");
        Contato c3 = new Contato("Han Solo", "8888-8888");
        //String palavra = "Testando um negocio aqui";
        
        
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
       // vetor.adiciona(palavra);
        
        
    }
}
