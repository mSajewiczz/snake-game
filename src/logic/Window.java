package logic;

import user_interface.Board;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {



    public Window() {
        //constructor Window(), that's creating window of our app
        setTitle("Snake Game");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);



        JLabel title = new JLabel("Snake Game 🐍", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setPreferredSize(new Dimension(600, 50));



        Board board = new Board();



        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(title);
        add(board);

        pack();
        setVisible(true);
    }


}
