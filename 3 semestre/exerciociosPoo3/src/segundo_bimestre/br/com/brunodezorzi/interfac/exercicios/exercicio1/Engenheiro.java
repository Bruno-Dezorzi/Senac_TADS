/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Engenheiro extends Funcionario {

    public Engenheiro() {
    }
    

    @Override
    public void trabalhar() {
        System.out.println("Projetando");
    }

    @Override
    public void descansar() {
        System.out.println("Dormindo com Python");
    }
    
}
