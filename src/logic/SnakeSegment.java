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
        Color darkGreen = new Color(0, 100, 0);
        g2.setColor(darkGreen);
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
        return this.snakeSegmentX;
    }

    public int getSnakeSegmentY() {
        return this.snakeSegmentY;
    }

    public void setSnakeSegmentY(int snakeSegmentY) {
        this.snakeSegmentY = snakeSegmentY;
    }

    public void setSnakeSegmentX(int snakeSegmentX) {
        this.snakeSegmentX = snakeSegmentX;
    }
}
