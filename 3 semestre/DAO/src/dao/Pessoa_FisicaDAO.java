
package dao;

import dao.DatabaseConnection;
import modelo.Pessoa_Fisica;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import util.CriptografiaUtil;

public class Pessoa_FisicaDAO {

    // Método para salvar uma pessoa física no banco de dados 
    public void salvarPessoaFisica(Pessoa_Fisica pessoaFisica) {
        String sql = 
          "INSERT INTO pessoas_fisicas (id_pessoa, cpf) VALUES (?, ?)";
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(sql)){

            // Definindo os parâmetros para o PreparedStatement 
            pstmt.setString(1, pessoaFisica.getId_pessoa());
            pstmt.setString(2, pessoaFisica.getCpf());

            // Executa o comando SQL 
            pstmt.executeUpdate();
            pstmt.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

    // implementar métodos listar, editar e deletar 
    public List<Pessoa_Fisica> listarPessoasFisicas(){
        String sql = "SELECT * FROM pessoas_fisicas";
        try (Connection connection = DatabaseConnection.getConnection(); 
             PreparedStatement pstmt = connection.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()){
            List<Pessoa_Fisica> pessoasFisicas = new ArrayList<>();
            while(rs.next()){
                Pessoa_Fisica pessoaFisica = new Pessoa_Fisica();
                pessoaFisica.setId_pessoa(rs.getString("id_pessoa"));
                pessoaFisica.setCpf(rs.getString("cpf"));
                pessoasFisicas.add(pessoaFisica);
            }
            pstmt.close();
            connection.close();
            return pessoasFisicas;
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList(); // só para o retorno ficar mais bonito
        }
    }
    
    public void deletarPessoaFisica() {
        String sql = 
          "DELETE FROM pessoas_fisicas WHERE id_pessoa = (SELECT MAX(id_pessoa) FROM pessoas_fisicas)";
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

