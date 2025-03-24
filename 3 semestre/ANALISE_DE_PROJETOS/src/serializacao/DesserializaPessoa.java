/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacao;

import modelo.Pessoa;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author 10253
 */
public class DesserializaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = null;
        
        try{
            FileInputStream fileIn = new FileInputStream("pessoa.disco");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            //desserializando o objeto
            pessoa = (Pessoa) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Objeto desserializado com sucesso");
            System.out.println("Nome: "+pessoa.getNome());
            System.out.println("Email: "+pessoa.getEmail());
        
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            System.out.println("Classe Pessoa não encontrada");
            ex.printStackTrace();
        }
        
    }
    
}
