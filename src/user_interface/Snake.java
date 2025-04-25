package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import java.awt.*;
import java.util.ArrayList;

public class Snake {
    ArrayList<SnakeSegment> snakeSegments = new ArrayList<>();

    SnakeHead snakeHead;
    private String direction = "right";
    private int snakeHeadPositionX = 0;
    private int snakeHeadPositionY = 0;

    public void startGame() {
        snakeHead = new SnakeHead(60, 0);
        int num = 0;

        for(int i = 0; i < 3; i++){
            snakeSegments.add(new SnakeSegment(num, 0));
            num+=20;
        }

        System.out.println("snakeSegments.size() = " + snakeSegments.size());
        move();
    }

    public void paintSnake(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        snakeHead.paintSnakeHeadSetter(g);
        for(SnakeSegment segment : snakeSegments) {
            segment.paintSnakeSegmentSetter(g);
        }
    }

    public void move() {
        switch (direction) {
            case "right" -> {
                moveSegments();

                snakeHeadPositionX = snakeHead.getSnakeHeadX() + 20;
                snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);

                moveInformation();
            }
            case "down" -> {

                moveSegments();

                snakeHeadPositionY = snakeHead.getSnakeHeadY() + 20;
                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() + 20);

                moveInformation();
            }
            case "up" -> {
                moveSegments();

                snakeHeadPositionY = snakeHead.getSnakeHeadY() - 20;
                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() - 20);

                moveInformation();
            }
            case "left" -> {
                moveSegments();

                snakeHeadPositionX = snakeHead.getSnakeHeadX() - 20;
                snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() - 20);

                moveInformation();
            }
        }
    }

    public void moveSegments() {
        int oldSnakeHeadPositionX = snakeHead.getSnakeHeadX();
        int oldSnakeHeadPositionY = snakeHead.getSnakeHeadY();

        //this snippet is always the same in code!
        for (int i = snakeSegments.size()-1; i > 0; i--) {
            snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
            snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
        }
        snakeSegments.get(0).setSnakeSegmentX(oldSnakeHeadPositionX);
        snakeSegments.get(0).setSnakeSegmentY(oldSnakeHeadPositionY);
    }

    public void moveInformation() {
        System.out.println("X: " + snakeHeadPositionX);
        System.out.println("Y: " + snakeHeadPositionY);
    }

    public void grow () {

    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSnakeHeadPositionX() {
        return snakeHeadPositionX;
    }

    public void setSnakeHeadPositionX(int snakeHeadPositionX) {
        this.snakeHeadPositionX = snakeHeadPositionX;
    }

    public int getSnakeHeadPositionY() {
        return snakeHeadPositionY;
    }

    public void setSnakeHeadPositionY(int snakeHeadPositionY) {
        this.snakeHeadPositionY = snakeHeadPositionY;
    }
}