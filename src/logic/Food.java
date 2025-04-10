package logic;

import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;

public class Food extends JPanel {

    //private variables
    private int x;
    private int y;


    public Food() {
        //constructor - has same name as class, here are all methods invoked like generateXY();
        respawn();
        spawnFood();
    }

        private void spawnFood() {
        //method - function for object
            Random rand = new Random();
            this.x = rand.nextInt(40) * 20; //max 580, if board 600x600 - 29 x 20,
            this.y = rand.nextInt(35) * 20; //same -
        }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GREEN);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }


    public int getY() {
        //getter
        return y;
    }

    public int getX() {
        //getter
        return x;
    }

    public void respawn() {
        //method - that is calling another method
        spawnFood();
    }
}
