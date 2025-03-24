/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Circulo extends Figura{
    private double raio;

    @Override
    double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Circulo() {
    }

       
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getDiamentro(double raio){
        return raio*2;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    public double area(double raio){
        return raio * 3.14 *2;
    }
    
}
