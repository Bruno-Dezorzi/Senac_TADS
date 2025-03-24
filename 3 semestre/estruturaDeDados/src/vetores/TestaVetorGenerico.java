package vetores;


import modelo.Contato;
import vetores.VetorGenerico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author 10253
 */
public class TestaVetorGenerico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VetorGenerico vetor = new VetorGenerico<>(5, Contato.class);
        
        Contato c1 = new Contato("Luke Skywalker", "9999-9999");
        Contato c2 = new Contato("Darth Vader", "1111-1111");
        Contato c3 = new Contato("Han Solo", "8888-8888");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);
    }

}
