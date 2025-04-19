package logic;

import java.awt.*;

public class SnakeSegment {
    protected void paintSnakeSegment(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, 20, 20);
    }


    public void paintSnakeSegmentSetter(Graphics g) {
        paintSnakeSegment(g);
    }
}
