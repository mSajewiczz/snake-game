package logic;

import javax.swing.*;
import java.awt.*;

public class GameOverWindow extends JFrame {
    public GameOverWindow(int score, String userNickName, String reason) {
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.lightGray);
        setFocusable(true);

        JLabel title = new JLabel("Game Over!", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setPreferredSize(new Dimension(600, 50));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel gameScore = new JLabel("Player " + userNickName + ", your score is: " + score);
        gameScore.setFont(new Font("Arial", Font.BOLD, 20));
        gameScore.setPreferredSize(new Dimension(600, 50));
        gameScore.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel reasonField = new JLabel("Reason: " + reason);
        reasonField.setFont(new Font("Arial", Font.BOLD, 20));
        reasonField.setPreferredSize(new Dimension(600, 50));
        reasonField.setAlignmentX(Component.CENTER_ALIGNMENT);

        setPreferredSize(new Dimension(600, 600));
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setFocusable(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createVerticalStrut(50));
        add(title);
        add(Box.createVerticalStrut(20));
        add(gameScore);
        add(Box.createVerticalStrut(20));
        add(reasonField);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}