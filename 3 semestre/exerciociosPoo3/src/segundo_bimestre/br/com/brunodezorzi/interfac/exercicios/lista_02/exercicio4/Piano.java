/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio4;

/**
 *
 * @author HP Victus
 */
public class Piano implements IntrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando Piano");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Piano");
    }
    
}
