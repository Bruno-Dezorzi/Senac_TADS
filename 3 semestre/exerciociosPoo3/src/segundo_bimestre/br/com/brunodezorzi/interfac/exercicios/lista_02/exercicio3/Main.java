/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio3;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Funcionario eng = new Engenheiro();
        Trabalhador ven = new Vendedor();
        
        eng.trabalhar();
        eng.descansar();
        
        System.out.println("");
        
        ven.trabalhar();
        ven.descansar();
    }
    
}
