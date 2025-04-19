package user_interface;

import java.awt.*;

public class Food {

    private static int x = 0;
    private static int y = 0;

    public Food() {
        generatePosition();
    }

    public static void generatePosition() {
        x = (int)(Math.random() * 601);
        y = (int)(Math.random() * 601);
    };

    protected void paintFood(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);
        g2.fillOval(x, y, 20, 20);
    }
}