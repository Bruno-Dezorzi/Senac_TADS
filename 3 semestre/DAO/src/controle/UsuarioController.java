package controle;

import dao.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import modelo.Usuario;
import visao.UsuarioView;

public class UsuarioController {

    private UsuarioView view;
    private final UsuarioDAO dao;
    

    public UsuarioController(UsuarioView view) {
        this.view = view;
        this.dao = new UsuarioDAO();
        // Adiciona o listener ao botão salvar
        
        
        this.view.addSalvarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarUsuario();
                listarUsuario(); //atualizado em 28/10
            }
        });
        
        
        this.view.addListarLista(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                listarUsuario();
            }
        });
        
        
        this.view.addDeletar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                deletarUsuario();
                listarUsuario();
            }
        });
        
    }

    public void salvarUsuario() {
       /*String nome = view.getNome();
        String login = view.getLogin();
        String senha = view.getSenha();
        Usuario usuario = new Usuario(nome, login, senha);*/
       
       Usuario usuario = 
             new Usuario(view.getEmail(), view.getSenha());
       dao.salvarUsuario(usuario); //atualizado em 28/10
       view.exibirMensagem("Usuário salvo com sucesso!");
    }
    
    public void listarUsuario(){ //implementado em 28/10
        List<Usuario> usuarios = dao.listarUsuarios();
        view.atualizarTabela(usuarios);
        
    }
    
    public void deletarUsuario(){
        dao.deletarUsuario();
    }

}
