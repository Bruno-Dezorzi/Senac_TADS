/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio4;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        IntrumentoMusical v = new Violao();
        IntrumentoMusical p = new Piano();
        IntrumentoMusical f = new Flauta();
        
        v.tocar();
        v.afinar();
        
        System.out.println("");
        
        p.tocar();
        p.afinar();
        
        System.out.println("");
        
        f.tocar();
        f.afinar();
        
        
    }
}
