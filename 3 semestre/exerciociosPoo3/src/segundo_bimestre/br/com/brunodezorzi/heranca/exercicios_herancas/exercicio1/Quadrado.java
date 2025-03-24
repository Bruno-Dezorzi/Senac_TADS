/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Quadrado extends Figura{
    private double lado;

    public Quadrado() {
    }

    public Quadrado(double lado, String cor) {
        super(cor);
        this.lado = lado;
    }

    @Override
    double area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }
    
    

    
    
    
    
}
