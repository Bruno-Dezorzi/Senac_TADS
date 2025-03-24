package dao;

import dao.DatabaseConnection;
import modelo.Pessoa;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PessoaDAO {

    // Método para salvar um usuário no banco de dados 
    public void salvarPessoa(Pessoa pessoa) {
        String sql = 
          "INSERT INTO pessoa (nome,id_endereco) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            // Definindo os parâmetros para o PreparedStatement 
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getId_endereco());
            
            

            // Executa o comando SQL 
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    

    // implementar métodos listar, editar e deletar 
    public List<Pessoa> listarUsuarios(){
        String sql = "SELECT * FROM usuarios";
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()){
            List<Pessoa> usuarios = new ArrayList<>();
            while(rs.next()){
                Pessoa usuario = new Pessoa();
                usuario.setId(rs.getString("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setId_endereco(rs.getString("id_endereco"));
                usuarios.add(usuario);
            }
            pstmt.close();
            connection.close();
            return usuarios;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();//só para o retorno ficar mais bonito
        }
    }
    
    public void deletarUsuario() {
        String sql = 
          "DELETE FROM usuarios WHERE id = (select max(id) from usuarios)";
        try (Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            

            // Executa o comando SQL 
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   
    
    
    
}
