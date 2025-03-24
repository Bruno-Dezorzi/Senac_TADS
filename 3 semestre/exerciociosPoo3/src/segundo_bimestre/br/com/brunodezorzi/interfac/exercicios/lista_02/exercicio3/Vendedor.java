/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio3;

/**
 *
 * @author HP Victus
 */
public class Vendedor extends Funcionario{

    public Vendedor() {
    }

    @Override
    public void trabalhar() {
        System.out.println("Vendendo");
    }

    @Override
    public void descansar() {
        System.out.println("Sonhando com lucro");
    }
    
    
}
