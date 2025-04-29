package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener{

    private int points = 0;
    private Timer timer;

    public Board() {
        //constructor that's responsible only for displaying the board JPanel
        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.lightGray);
        snake.startGame();
        appTimer();
        setFocusable(true);
        addKeyListener(this);
    }

    private int score() {
        points++;
        return points;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {

            if(!snake.getDirection().equals("down")) {
                snake.setDirection("up");
                snake.move();
            } else {
                snake.move();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if(!snake.getDirection().equals("up")) {
                snake.setDirection("down");
                snake.move();
            } else {
                snake.move();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if(!snake.getDirection().equals("left")) {
                snake.setDirection("right");
                snake.move();
            } else {
                snake.move();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if(!snake.getDirection().equals("right")) {
                snake.setDirection("left");
                snake.move();
            } else {
                snake.move();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void appTimer () {
        timer = new Timer(100, e -> {
            snake.move();

            if((snake.getSnakeHeadPositionX() == food.getX() || snake.snakeSegments.get(0).getSnakeSegmentX() == food.getX()) && (snake.getSnakeHeadPositionY() == food.getY() || snake.snakeSegments.get(0).getSnakeSegmentY() == food.getY())) {
                snake.grow();


                System.out.println("Points:  " + score());
            }
            repaint();
        });
        timer.start();
    }

    Food food = new Food();
    Snake snake = new Snake();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        food.paintFood(g);
        snake.paintSnake(g);
    }

}
