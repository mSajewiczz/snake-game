package logic;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel {

    public Board() {
        //here will be all logic - Board.java is a main file
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
}
