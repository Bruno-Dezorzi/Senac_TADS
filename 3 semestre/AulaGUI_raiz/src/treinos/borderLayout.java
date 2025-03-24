package treinos;

import javax.swing.*;
import java.awt.*;

public class borderLayout {
    public static void main(String[] args) {
        // Background
        JFrame frame = new JFrame("Border Layout");
        JPanel panel = new JPanel(new BorderLayout());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.setSize(300, 300);
        panel.setBackground(Color.green);

        // Itens
        JButton norte = new JButton("Botão do Norte");
        norte.setPreferredSize(new Dimension(300, 100));
        JButton sul = new JButton("Botão do Sul");
        JButton leste = new JButton("Botão do Leste");
        JButton oeste = new JButton("Botão do Oeste");
        JButton centro = new JButton("Botão do Centro");

        panel.add(norte, BorderLayout.NORTH);
        panel.add(sul, BorderLayout.SOUTH);
        panel.add(leste, BorderLayout.EAST);
        panel.add(oeste, BorderLayout.WEST);
        panel.add(centro, BorderLayout.CENTER);
    }
}
