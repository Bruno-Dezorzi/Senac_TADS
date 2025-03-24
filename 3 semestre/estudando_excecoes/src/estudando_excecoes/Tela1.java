/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudando_excecoes;

import javax.swing.JOptionPane;

/**
 *
 * @author HP Victus
 */
public class Tela1 {
    public static void main(String[] args) {
        
        try{
            String var = JOptionPane.showInputDialog("Digite um número inteiro");
        if(var.equals("")){
            throw new Exception("PARA DE ERRAR SEU JAGUARA");
        } else{
            System.out.println("ISSO SEU VADIO, NÃO PODE COLOCAR NULLO");
        }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
           
    }
}
