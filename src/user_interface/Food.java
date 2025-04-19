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

//    @Override
    protected void paintFood(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(x, y, 80, 80);
    }
}
