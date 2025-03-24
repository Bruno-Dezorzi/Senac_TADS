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
public class Tela {
    public static void main(String[] args) {
        String var = JOptionPane.showInputDialog("Digite um número inteiro");
        
        try{
            int num = Integer.parseInt(var);
            JOptionPane.showMessageDialog(null, "Digitou um número");
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }
}
