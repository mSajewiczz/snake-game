package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel{

    public Board() {
        //constructor that's responsible only for displaying the board JPanel
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.RED);
    }

    Food food = new Food();
    Snake snake = new Snake();

    //here you're using your custom food.paintFood() method from food class, that's drawing food object (not only for food)
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        food.paintFood(g);
        snake.paintSnake(g);
    }


}
