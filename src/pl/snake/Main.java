package pl.snake;
import ui.Window;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window appWindow = new Window();
                appWindow.setVisible(true);
            }
        });
    }
}