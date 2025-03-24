/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudando_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP Victus
 */
public class tratamentoexcecoes {
    
    public static void main(String[] args) {
       
        
        Scanner leia = new Scanner(System.in);
        int x;
        
        try{
            
            x = leia.nextInt();
            
            int y = 100/x;
        
            System.out.println(y);
        } catch(ArithmeticException e){
            System.out.println("Ocorreu um erro de aritmética");
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Entrada incopatível");
            System.out.println(e.getMessage());
        }
    }
            
}
