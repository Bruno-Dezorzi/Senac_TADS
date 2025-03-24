/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.polimorfismo;

/**
 *
 * @author HP Victus
 */
public class FiguraGeometrica {
    
    
    //circulo
    public void calcularArea(int raio){
        System.out.println(raio);
    }
    
    //retangulo
    public void calcularArea(int altura, int largura){
        System.out.println("Altura: " + altura + " Largura: " + largura);
    }
    
    
    
    //triangulo
    public void calcularArea(float base, float altura){
        System.out.println("Altura: " + altura + " Base: " + base);
    }
}

