/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.polimorfismo;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Forma forma = new Circulo();
        forma.calcularArea();
        
        forma = new Quadrado();
        forma.calcularArea();
    }
}
