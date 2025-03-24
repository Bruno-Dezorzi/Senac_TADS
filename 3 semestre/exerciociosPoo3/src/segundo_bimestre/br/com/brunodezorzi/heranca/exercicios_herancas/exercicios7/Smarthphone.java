/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.heranca.exercicios_herancas.exercicios7;

/**
 *
 * @author HP Victus
 */
public class Smarthphone extends Eletronico{
    
    private String sistemaOperacional;

    public Smarthphone() {
    }

    public Smarthphone(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void ligar() {
        System.out.println("O Smarthphone está ligado");
    }
    
    
}
