/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio2;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Animal c = new Cachorro();
        Animal g = new Gato();
        Animal p = new Passaro();
        
        
        c.emitirSom();
        c.mover();
        
        System.out.println("");
        
        g.emitirSom();
        g.mover();
        
        System.out.println("");
        
        p.emitirSom();
        p.mover();
    }
    
}
