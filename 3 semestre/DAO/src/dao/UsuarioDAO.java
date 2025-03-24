package dao;

import dao.DatabaseConnection;
import modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import util.CriptografiaUtil;

public class UsuarioDAO {

    // Método para salvar um usuário no banco de dados 
    public void salvarUsuario(Usuario usuario) {
        String sql = 
          "INSERT INTO usuarios (email, senha) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); 
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            // Definindo os parâmetros para o PreparedStatement 
            pstmt.setString(1, usuario.getEmail());
            
            
            String senhaCriptografada = CriptografiaUtil.criptografiaSenha(usuario.getSenha());
            pstmt.setString(2, senhaCriptografada);
            
            

            // Executa o comando SQL 
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public Usuario autenticaUsuario(String email, String senha) {
        String sql = "SELECT * FROM usuarios WHERE email=? AND senha =?";
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, email);
            String senhaCriptografada = CriptografiaUtil.criptografiaSenha(senha);
            pstmt.setString(2, senhaCriptografada);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getString("email"), 
                                   rs.getString("senha"));
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return null;
    }

    // implementar métodos listar, editar e deletar 
    public List<Usuario> listarUsuarios(){
        String sql = "SELECT * FROM usuarios";
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()){
            List<Usuario> usuarios = new ArrayList<>();
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getString("id"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
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
