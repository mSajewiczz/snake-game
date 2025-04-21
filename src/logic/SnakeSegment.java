package logic;

import java.awt.*;

public class SnakeSegment {

    private int snakeSegmentX = 0;
    private int snakeSegmentY = 0;

    public SnakeSegment(int x, int y) {
        snakeSegmentX = x;
        snakeSegmentY = y;
    }

    protected void paintSnakeSegment(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(this.snakeSegmentX, this.snakeSegmentY, 20, 20);
    }

    public void paintSnakeSegmentSetter(Graphics g) {
        paintSnakeSegment(g);
    }

    @Override
    public String toString() {
        return "SnakeSegment{x=" + snakeSegmentX + ", y=" + snakeSegmentY + "}";
    }

    public int getSnakeSegmentX() {
        return snakeSegmentX;
    }

    public int getSnakeSegmentY() {
        return snakeSegmentY;
    }
}
