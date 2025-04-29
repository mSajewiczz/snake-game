package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGameWindow extends JFrame {
    public StartGameWindow() {
        JLabel title = new JLabel("🐍 Snake Game 🐍", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setPreferredSize(new Dimension(600, 50));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton startGameButton = new JButton("Start Game");
        startGameButton.setFont(new Font("Arial", Font.BOLD, 20));
        startGameButton.setPreferredSize(new Dimension(600, 50));
        startGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        setPreferredSize(new Dimension(600, 600));
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setFocusable(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createVerticalStrut(50));
        add(title);
        add(Box.createVerticalStrut(20));
        add(startGameButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Window();
                dispose();
            }
        });
    }
}