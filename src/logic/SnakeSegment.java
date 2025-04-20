package logic;

import java.awt.*;

public class SnakeSegment {

    private int snakeSegmentX = 0;
    private int snakeSegmentY = 0;


    protected void paintSnakeSegment(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(this.snakeSegmentX, this.snakeSegmentY, 20, 20);
    }


    public void paintSnakeSegmentSetter(Graphics g) {
        paintSnakeSegment(g);
    }
}
