package user_interface;

import logic.GameOverWindow;
import logic.SnakeHead;
import logic.SnakeSegment;
import logic.Window;

import javax.swing.*;
import java.awt.*;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener{

    private Timer timer;
    JLabel scoreCounter;
    String userNickName;
    private int score = 0;
    private boolean crash = false;
    private String reason = "you're out of the map!";

    public Board(String userNickName) {

        scoreCounter = new JLabel("Current score: " + score, SwingConstants.CENTER);
        scoreCounter.setFont(new Font("Arial", Font.BOLD, 24));
        scoreCounter.setPreferredSize(new Dimension(600, 50));

        this.userNickName = userNickName;

        System.out.println(score);
        add(scoreCounter);

        setPreferredSize(new Dimension(600, 600));
        setBackground(Color.lightGray);
        snake.startGame();
        appTimer();
        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && !snake.getDirection().equals("down")) {
            snake.setDirection("up");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN && !snake.getDirection().equals("up")) {
            snake.setDirection("down");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && !snake.getDirection().equals("left")) {
            snake.setDirection("right");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && !snake.getDirection().equals("right")) {
            snake.setDirection("left");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void isCrash() {
        for(int i = 0; i < snake.snakeSegments.size(); i++) {
            if((snake.snakeHead.getSnakeHeadX() == snake.snakeSegments.get(i).getSnakeSegmentX()) &&
                    (snake.snakeHead.getSnakeHeadY() == snake.snakeSegments.get(i).getSnakeSegmentY())) {
                crash = true;
                reason = "you have collided with a part of the snake's body!";
            }
        }
    }


    public void appTimer () {
        timer = new Timer(100, e -> {
            snake.move();

            if((snake.getSnakeHeadPositionX() == food.getX() || snake.snakeSegments.get(0).getSnakeSegmentX() == food.getX()) &&
                    (snake.getSnakeHeadPositionY() == food.getY() || snake.snakeSegments.get(0).getSnakeSegmentY() == food.getY())) {
                snake.grow();
                score+=1;
                scoreCounter.setText("Current score: " + score);
            }

            isCrash();

            if((snake.getSnakeHeadPositionX() < 0 ||
                    snake.getSnakeHeadPositionX() > 600) || (snake.getSnakeHeadPositionY() < 0 || snake.getSnakeHeadPositionY() > 600) || crash) {

                new GameOverWindow(score, userNickName, reason);
                timer.stop();
                setVisible(false);

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
