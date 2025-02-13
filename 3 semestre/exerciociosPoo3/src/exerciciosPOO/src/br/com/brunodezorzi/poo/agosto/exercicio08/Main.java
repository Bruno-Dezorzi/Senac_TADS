/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosPOO.src.br.com.brunodezorzi.poo.agosto.exercicio08;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author HP Victus
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuario usu1 = new Usuario("Bruno Dezozi",20,10);
        Usuario usu2 = new Usuario("Josué",30,20);
        
        Livro livro1 = new Livro("Harry Potter", "JK Rowling", 1984);
        Livro livro2 = new Livro("Senhor dos Anéis: A Sociedade do Anel", "JRR Tolkien", 1934);
        
        Biblioteca bib = new Biblioteca();
        
        bib.adicionarUsuario(usu1);
        bib.adicionarUsuario(usu2);
        
        bib.adicionarLivro(livro1);
        bib.adicionarLivro(livro2);
        
        bib.mostrarLivros();
        

    }
    
}
