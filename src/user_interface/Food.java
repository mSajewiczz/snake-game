package user_interface;

import java.awt.*;

public class Food {

    private static int x = 0;
    private static int y = 0;
    private static final int[] array = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320, 340, 360, 380, 400, 420, 440, 460, 480, 500, 520, 540, 560, 580};


    public Food() {
        generatePosition();
    }



    public static void generatePosition() {
//        x = (int)(Math.random() * 601);
//        y = (int)(Math.random() * 601);

        x = array[(int)(Math.random() * 30)];
        y = array[(int)(Math.random() * 30)];

    };

    protected void paintFood(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //you need to generate number between 0 and 600
        Color darkRed = new Color(100, 0, 0);
        g2.setColor(darkRed);

            g2.fillOval(x, y, 20, 20);
            System.out.println("FOOD x: " + x + ", FOOD y: " + y);
            //if you had not an idea, you could create array from 0 to 600, by adding 20 and then get random indexes of X array and Y array or together and so on (so stupid)

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