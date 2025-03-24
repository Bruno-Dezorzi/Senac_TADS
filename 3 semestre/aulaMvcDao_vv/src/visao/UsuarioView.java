/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

/**
 *
 * @author 10253
 */
public class UsuarioView extends JFrame {

    private JTextField nomeField = new JTextField(20);
    private JTextField loginField = new JTextField(20);
    private JPasswordField senhaField = new JPasswordField(20);
    
    private JButton salvarButton = new JButton("Salvar");
    private JButton listarButton = new JButton("Listar");//atualizado em 28/10
    private JButton deletarButton = new JButton("Deletar");

    
    private JTable usuarioTable;
    private DefaultTableModel tableModel;

    public UsuarioView() {
        setTitle("Cadastro de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        
        //inicializa o tableModel com um vetor de String que 
        //contém os títulos das colunas da JTable
        tableModel = new DefaultTableModel(new String[]{"ID","Nome","Login","Senha"},0);
        usuarioTable = new JTable(tableModel);
        
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("Nome"));
        inputPanel.add(nomeField);
        inputPanel.add(new JLabel("Login"));
        inputPanel.add(loginField);
        inputPanel.add(new JLabel("Senha"));
        inputPanel.add(senhaField);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(salvarButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(deletarButton);
        
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(usuarioTable),BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
    }

    public void atualizarTabela(List<Usuario> usuarios){
        tableModel.setRowCount(0);// limpar por garantia
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[]{
                                            usuario.getId(),
                                            usuario.getNome(),
                                            usuario.getLogin(),
                                            usuario.getSenha()});
            
        }
    }
    
    public String getNome() {
        return nomeField.getText();
    }

    public String getLogin() {
        return loginField.getText();
    }

    public String getSenha() {
        return new String(senhaField.getPassword());
    }

    public void addSalvarListener(ActionListener listener) {
        salvarButton.addActionListener(listener);
    }
    
    public void addListarLista(ActionListener listener) {
        listarButton.addActionListener(listener);
    }

    public void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public void addDeletar(ActionListener actionListener) {
        deletarButton.addActionListener(actionListener);
    }
    

}
