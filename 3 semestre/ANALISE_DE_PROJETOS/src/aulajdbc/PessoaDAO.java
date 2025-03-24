/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulajdbc;

import modelo.Pessoa;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author 10253
 */
public class PessoaDAO {
    public void inserir(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO pessoas(nome,email) VALUES (?,?)";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getEmail());
        stmt.executeUpdate();
        
        stmt.close();
        conn.close();
    }
    
    public List<Pessoa> listar() throws SQLException{
        String sql = "SELECT * FROM pessoas";
        List<Pessoa> pessoas = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Pessoa pessoa = new Pessoa();
             pessoa.setNome(rs.getString("nome"));
             pessoa.setEmail(rs.getString("email"));
             pessoas.add(pessoa);
        }   
        stmt.close();
        conn.close();
        return pessoas;
    }
    
    public void atualizar(Pessoa pessoa, int id) throws SQLException{
        String sql = "UPDATE pessoas SET nome = ?, email = ? WHERE id = ?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, pessoa.getNome());
        stmt.setString(2, pessoa.getEmail());
        stmt.setInt(3, id);
        stmt.executeUpdate();
        
        stmt.close();
        conn.close();
    }
    
    public void delete(Pessoa pessoa, int id) throws SQLException{
        String sql = "DELETE FROM pessoas WHERE id = ?";
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement smt = conn.prepareCall(sql);
        smt.setInt(1,id);
        smt.executeUpdate();
        
        smt.close();
        conn.close();
    }
    
}
