/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulajdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pessoa;

/**
 *
 * @author 10253
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Pessoa pessoa = new Pessoa("Mickey Mouse","mickey@gmail.com");
        PessoaDAO dao = new PessoaDAO();
        
//        try {
//            dao.inserir(pessoa);
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }

//          try{
//              List<Pessoa> pessoas =  dao.listar();
//              for (Object pessoa1 : pessoas) {
//                  System.out.println(pessoa.getNome() + " " + pessoa.getEmail());
//              }
//          } catch (SQLException ex) {
//            ex.printStackTrace();
//            }
        
//        try{
//            dao.atualizar(pessoa, 3);
//        } 
//        catch (SQLException ex){
//            ex.printStackTrace();
//            
//        }
           
          try{
              dao.delete(pessoa, 3);
          } catch(SQLException e){
              e.printStackTrace();
          }

    }
    
    }

