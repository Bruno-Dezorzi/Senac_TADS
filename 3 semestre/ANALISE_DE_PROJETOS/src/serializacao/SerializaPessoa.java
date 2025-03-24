/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializacao;

import modelo.Pessoa;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SerializaPessoa {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luke Skywalker", "lukesky@gmail.com");
        
        try {
            FileOutputStream fileOut = new FileOutputStream("pessoa.disco");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            //serializando
            out.writeObject(pessoa);
            out.close();
            fileOut.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
