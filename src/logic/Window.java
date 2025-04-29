package logic;

import user_interface.Board;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(String userNickName) {
        //constructor Window(), that's creating window of our app
        setTitle("Snake Game");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);

        Board board = new Board(userNickName);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(board);

        pack();
        setVisible(true);
    }
}
