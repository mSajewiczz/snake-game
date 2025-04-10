package ui;

import logic.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    public Window() {
        setTitle("🐍 Java Snake Game 🐍");
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel gameTitle = new JLabel("Welcome in the Snake Game! 🐍");
        gameTitle.setFont(new Font("Sans-Serif", Font.BOLD, 28));
        gameTitle.setBounds(10, 10, 1000, 28);

        JButton gameStart = new JButton("Start game");
        gameStart.setBounds(10, 58, 330, 30);

        JButton helper = new JButton("Helper - close all");
        helper.setBounds(360, 58, 330, 30);

        JLabel gameStartInfo = new JLabel("");
        gameStartInfo.setBounds(10, 88, 330, 30);

        Board gameBoard = new Board();
        gameBoard.setBounds(10, 118, 800, 700);
        gameBoard.setVisible(false);

        add(gameStart);
        add(gameTitle);
        setLayout(null);
        add(gameStartInfo);
        add(gameBoard);
        add(helper);


        gameStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameStartInfo.setText("You've started the game!");
                gameBoard.setVisible(true);
            }
        });

        helper.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               gameBoard.setVisible(false);
               gameStartInfo.setText("");

           }
        });
    }

    public static void window(String[] args) {

        Window frame = new Window();
        frame.setVisible(true);

    }

}
