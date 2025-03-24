/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulamvcdao;

import controle.UsuarioController;
import visao.UsuarioView;

/**
 *
 * @author 10253
 */
public class UsuarioTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioView visao = new UsuarioView();
        UsuarioController controle = new UsuarioController(visao);
        visao.setVisible(true);
        controle.listarUsuario();
    }
    
}
