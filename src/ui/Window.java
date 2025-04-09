package ui;

import javax.swing.*;

public class Window extends JFrame {

    public Window() {
        setTitle("Java Snake Game");

        setSize(450, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
    }

    public static void window(String[] args) {

        Window frame = new Window();

        frame.setVisible(true);

    }

}
