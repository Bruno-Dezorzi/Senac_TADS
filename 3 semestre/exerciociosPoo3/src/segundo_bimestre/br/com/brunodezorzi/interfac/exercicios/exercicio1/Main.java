/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.exercicio1;

/**
 *
 * @author HP Victus
 */
public class Main {
    public static void main(String[] args) {
        Funcionario eng = new Engenheiro();
        Trabalhador vend = new Vendedor();
        
        // Usando poliformismo kkk
        
        eng.descansar();
        eng.trabalhar();
        
        vend.descansar();
        vend.trabalhar();
    }
}
