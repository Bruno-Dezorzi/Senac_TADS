/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.aula.Animal;

/**
 *
 * @author HP Victus
 */
public class Animal implements SerVivo{

    public Animal() {
    }
    
    
    

    @Override
    public void mover() {
        System.out.println("EU ME REMEXO MUITO");
    }

    @Override
    public void comer(int massa) {
        System.out.println("Comendo " + massa + "de gostosura" );
    }

    @Override
    public void info() {
        System.out.println("Informações do ANIMAL SEU MULA");
    }
    
    
}
