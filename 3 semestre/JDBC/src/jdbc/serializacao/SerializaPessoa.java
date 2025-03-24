
package serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import jdbc.serializacao.Pessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP Victus
 */
public class SerializaPessoa {
    public static void main(String[] args) throws IOException {
        Pessoa pessoa = new Pessoa("Luke Skywalker", "luke@skywalker");
        
        try{
            FileOutputStream fileOut = new FileOutputStream("pessoa.disco");
            
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(pessoa);
            out.close();
            fileOut.close();
                    
        } catch(IOException ex){
            ex.printStackTrace();
        }

   
    }
}