package logic;

import java.awt.*;

public class SnakeSegment {
    public SnakeSegment () {
    }

    public void paintSnakeSegment(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(0, 0, 20, 20);
    }
}
