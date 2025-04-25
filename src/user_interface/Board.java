package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener{

    private Timer timer;

    public Board() {
        //constructor that's responsible only for displaying the board JPanel
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.RED);
        snake.startGame();
        appTimer();
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            snake.setDirection("up");
            snake.move();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            snake.setDirection("down");
            snake.move();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.setDirection("right");
            snake.move();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            snake.setDirection("left");
            snake.move();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    public void appTimer () {
        timer = new Timer(800, e -> {
            snake.move();

            if(snake.getSnakeHeadPositionX() == food.getX() && snake.getSnakeHeadPositionY() == food.getY()) {

            }
            repaint();
        });
        timer.start();
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


    //board is listening for a click of arrow from keyboard -> then invoke the function of move() that is in snake class

}
