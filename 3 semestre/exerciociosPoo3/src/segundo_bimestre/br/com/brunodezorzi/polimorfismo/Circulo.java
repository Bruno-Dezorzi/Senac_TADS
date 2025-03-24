/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.polimorfismo;

/**
 *
 * @author HP Victus
 */
public class Circulo extends Forma {
    private int raio;

    public Circulo() {
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Calculando");
    }
    
    
}
