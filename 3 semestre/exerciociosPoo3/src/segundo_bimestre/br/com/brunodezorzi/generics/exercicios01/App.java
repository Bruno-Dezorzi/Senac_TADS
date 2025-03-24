/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.generics.exercicios01;

/**
 *
 * @author HP Victus
 */
public class App {
    public static void main(String[] args) {
        Par<String, Double> aluno  = new Par("Bruno",9.0);
        Par<Integer, String> funcionario  = new Par(445,"Antônio");
        Par<Float, Float> coordenadas  = new Par(3434.343,564553.0);
        
        aluno.resultado();
        funcionario.resultado();
        coordenadas.resultado();
        
    }
}
