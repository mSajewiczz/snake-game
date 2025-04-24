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
        //you need to generate number between 0 and 600
        g2.setColor(Color.GREEN);
        if((x / 20 == 0) && (y / 20 == 0)) {
            g2.fillRect(x, y, 20, 20);
            System.out.println("FOOD x: " + x + ", FOOD y: " + y);
            //if you had not an idea, you could create array from 0 to 600, by adding 20 and then get random indexes of X array and Y array or together and so on (so stupid)
        } else {
            Food.generatePosition();
        }
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Food.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Food.y = y;
    }
}