/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.aulajdbc.modelo;

import jdbc.serializacao.Pessoa;
import java.sql.*;
import jdbc.aulajdbc.DatabaseConection;
/**
 *
 * @author HP Victus
 */
public class PessoaDAO {
    public void inserir(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO PESSOAS (NOME,EMAIL) VALUES (" + pessoa.getNome() + "," + pessoa.getEmail() + ")";
        try(
                Connection conn = DatabaseConection.getConnection();
                
                PreparedStatement stmt = conn.prepareStatement(sql);
                
                stmt.setString(1, pessoa);
        )
    }
}
