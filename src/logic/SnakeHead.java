package logic;

import java.awt.*;

public class SnakeHead {

    public SnakeHead() {

    }

    public void paintSnakeHead(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLUE);
        g2.fillRect(20, 0, 20, 20);
    }


}
