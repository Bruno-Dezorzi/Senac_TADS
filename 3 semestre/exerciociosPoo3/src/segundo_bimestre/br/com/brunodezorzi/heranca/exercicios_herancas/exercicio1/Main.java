/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5,"Azul");
        System.out.println(circulo.area(circulo.getRaio()));
        System.out.println(circulo.toString());
        
        Triangulo triangulo = new Triangulo(5, 10, "Amarelo");
        System.out.println(triangulo.toString());
        
        Quadrado qud = new Quadrado(5, "Rosa");
        System.out.println(qud.toString());
        
        
        
    }
    
}
