package logic;

import java.awt.*;

public class SnakeHead {

    private int snakeHeadX = 0;
    private int snakeHeadY = 0;

    public SnakeHead(int x, int y) {
        snakeHeadX = x;
        snakeHeadY = y;
    }

    protected void paintSnakeHead(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color lightGreen = new Color(80, 160, 3);
        g2.setColor(lightGreen);
        g2.fillRect(this.snakeHeadX, this.snakeHeadY, 20, 20);
    }


    public void paintSnakeHeadSetter(Graphics g) {
        paintSnakeHead(g);
    }

    public int getSnakeHeadX() {
        return snakeHeadX;
    }

    public void setSnakeHeadX(int snakeHeadX) {
        this.snakeHeadX = snakeHeadX;
    }

    public int getSnakeHeadY() {
        return snakeHeadY;
    }

    public void setSnakeHeadY(int snakeHeadY) {
        this.snakeHeadY = snakeHeadY;
    }
}
