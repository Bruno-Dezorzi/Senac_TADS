/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.generics.exercicio2;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        SimpleList<String> lista  = new SimpleList<String>();
        
        lista.add("Eu");
        lista.add("Tu");
        lista.add("Ele");
        lista.add("Ela");
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));
                
        System.out.println(lista.size());
        
    }
}
