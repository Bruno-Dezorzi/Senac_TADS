/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.serializacao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.FileSystemNotFoundException;

/**
 *
 * @author HP Victus
 */
public class DesserializaPessoa {
    public static void main(String[] args) throws ClassNotFoundException {
        Pessoa pessoa = null;
        
        
        try{
        FileInputStream fileInput = new FileInputStream("pessoa.disco");
        ObjectInputStream input = new ObjectInputStream(fileInput);
            
        pessoa = (Pessoa) input.readObject();
        
        
        fileInput.close();
        input.close();
        
        System.out.println("Desserializado");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Email: " + pessoa.getEmail());
        
        } catch(IOException ex){
            ex.printStackTrace();
            
        } catch(FileSystemNotFoundException ex){
            ex.printStackTrace();
        }
    }
}