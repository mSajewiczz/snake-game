package user_interface;

public class Food {

    private static int x = 0;
    private static int y = 0;

    public Food() {
        generateFood();
    }


    public static void generateFood() {
        x = (int)(Math.random() * 601);
        y = (int)(Math.random() * 601);
    };
}
