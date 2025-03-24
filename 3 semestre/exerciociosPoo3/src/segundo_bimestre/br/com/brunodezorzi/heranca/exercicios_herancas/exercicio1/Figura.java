/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicio1;

/**
 *
 * @author HP Victus
 */
public abstract class Figura {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    abstract double area();

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
    }
    
    
}
