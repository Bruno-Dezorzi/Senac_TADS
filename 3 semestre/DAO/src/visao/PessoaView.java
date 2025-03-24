/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP Victus
 */
public class PessoaView extends JFrame {
    private JTextField nome = new JTextField(20);
    private JTextField id_endereco = new JTextField(20);
    
    private JButton salvarButton = new JButton("Salvar");
    private JButton listarButton = new JButton("Listar");//atualizado em 28/10
    private JButton deletarButton = new JButton("Deletar");
    
    private JTable pessoatable;
    private DefaultTableModel tablemodel;
    
    public PessoaView(){
        setTitle("Cadastro Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        
        tablemodel = new DefaultTableModel(new String[]{"ID","Nome","ID_Endereço"},0);
        pessoatable = new JTable(tablemodel);
        
        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Nome"));
        inputPanel.add(nome);
        inputPanel.add(new JLabel("ID_Endereço"));
        inputPanel.add(id_endereco);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(salvarButton);
        buttonPanel.add(listarButton);
        buttonPanel.add(deletarButton);
        
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(pessoatable),BorderLayout.CENTER);
        add(buttonPanel,BorderLayout.SOUTH);
    }
}
