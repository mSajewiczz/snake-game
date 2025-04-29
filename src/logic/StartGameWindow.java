package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartGameWindow extends JFrame {

    public StartGameWindow() {
        setTitle("Snake Game - Start");
        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.lightGray);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setFocusable(true);


        JLabel title = new JLabel("Snake Game", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel userNameTitle = new JLabel("Enter your nickname:", SwingConstants.CENTER);
        userNameTitle.setFont(new Font("Arial", Font.PLAIN, 22));
        userNameTitle.setAlignmentX(Component.CENTER_ALIGNMENT);


        JTextField userNameField = new JTextField();
        userNameField.setMaximumSize(new Dimension(300, 40));
        userNameField.setFont(new Font("Arial", Font.PLAIN, 20));
        userNameField.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton startGameButton = new JButton("Start Game");
        startGameButton.setFont(new Font("Arial", Font.BOLD, 24));
        startGameButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startGameButton.setBackground(Color.lightGray);
        startGameButton.setFocusPainted(false);

        JLabel errorMessage = new JLabel("", SwingConstants.CENTER);
        errorMessage.setFont(new Font("Arial", Font.PLAIN, 15));
        errorMessage.setAlignmentX(Component.CENTER_ALIGNMENT);


        add(Box.createVerticalStrut(40));
        add(title);

        add(Box.createVerticalStrut(50));
        add(userNameTitle);

        add(Box.createVerticalStrut(20));
        add(userNameField);

        add(Box.createVerticalStrut(40));
        add(startGameButton);

        add(Box.createVerticalStrut(20));
        add(errorMessage);

        add(Box.createVerticalGlue());


        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userNameField.getText() == null || userNameField.getText().equals("")) {
                    errorMessage.setText("Please enter your nickname!");
                    errorMessage.setForeground(Color.red);
                }else {
                    new Window(userNameField.getText());
                    errorMessage.setText("");
                    dispose();
                }
            }
        });


        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
