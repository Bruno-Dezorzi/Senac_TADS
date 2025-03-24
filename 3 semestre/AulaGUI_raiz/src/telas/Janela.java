package telas;

import javax.swing.*;
import java.awt.*;

public class Janela {


    public static void main(String[] args) {
        // Back

        JFrame frame = new JFrame("Minha primeira Janela");
        JPanel panel = new JPanel();
        // Objetos
        JButton botton = new JButton();
        JLabel label = new JLabel();

        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setBackground(Color.green);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setAlwaysOnTop(true);

        
        panel.setSize(300,400);



        panel.add(botton);
        botton.setSize(20,25);
        botton.setText("Clique aqui");

        panel.add(label);
        label.setSize(40,40);

        frame.add(panel);

        ////// VER OS LAYOUTS E DESENVOLVER UMA TELA SIMPLES
    }

}
