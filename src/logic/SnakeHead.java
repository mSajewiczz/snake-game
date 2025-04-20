package logic;

import java.awt.*;

public class SnakeHead {

    private int snakeHeadX = 20;
    private int snakeHeadY = 0;

    protected void paintSnakeHead(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillRect(this.snakeHeadX, this.snakeHeadY, 20, 20);
    }


    public void paintSnakeHeadSetter(Graphics g) {
        paintSnakeHead(g);
    }
}
