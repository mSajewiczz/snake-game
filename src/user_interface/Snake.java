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
    private char option = 'r';

    public String getDirection() {
        return direction;
    }

    public void startGame() {
        snakeHead = new SnakeHead(20, 0);
        int num = 0;

        for(int i = 0; i < 3; i++){
            snakeSegments.add(new SnakeSegment(num, 0));
            num-=20;
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
        int oldX = snakeHead.getSnakeHeadX();
        int oldY = snakeHead.getSnakeHeadY();

        if (direction.equals("right") && option != 'l') {
            option = 'r';
            snakeHeadPositionX = snakeHead.getSnakeHeadX() + 20;
            snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);

            moveSegments(oldX, oldY);
        } else if (direction.equals("left") && option != 'r') {
            option = 'l';
            snakeHeadPositionX = snakeHead.getSnakeHeadX() - 20;
            snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() - 20);

            moveSegments(oldX, oldY);
        } else if (direction.equals("down") && option != 'u') {
            option = 'd';
            snakeHeadPositionY = snakeHead.getSnakeHeadY() + 20;
            snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() + 20);

            moveSegments(oldX, oldY);
        } else if (direction.equals("up") && option != 'd') {
            option = 'u';
            snakeHeadPositionY = snakeHead.getSnakeHeadY() - 20;
            snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() - 20);

            moveSegments(oldX, oldY);
        }
    }

    public void moveSegments(int oldX, int oldY) {
        for (int i = snakeSegments.size()-1; i > 0; i--) {
            snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
            snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
        }
        snakeSegments.get(0).setSnakeSegmentX(oldX);
        snakeSegments.get(0).setSnakeSegmentY(oldY);
    }

    public void grow () {
        Food.generatePosition();
        snakeSegments.add(new SnakeSegment(snakeSegments.get(snakeSegments.size()-1).getSnakeSegmentX(), snakeSegments.get(snakeSegments.size()-1).getSnakeSegmentY()));
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSnakeHeadPositionX() {
        return snakeHeadPositionX;
    }

    public int getSnakeHeadPositionY() {
        return snakeHeadPositionY;
    }

}