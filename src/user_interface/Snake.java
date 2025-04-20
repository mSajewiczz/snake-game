package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    ArrayList<SnakeSegment> snakeSegments = new ArrayList<>();

    SnakeHead snakeHead;
    SnakeSegment snakeSegment;

    public void startGame() {
        snakeHead = new SnakeHead(20, 0);

        snakeSegments.add(new SnakeSegment(40, 0)); //for head
        snakeSegments.add(new SnakeSegment(20, 0));
        snakeSegments.add(new SnakeSegment(0, 0)); //for 1st segment

        for(int i = 1; i < snakeSegments.size(); i++){
            snakeSegment = new SnakeSegment(40, 0);
        }
        move();
    }

    public void paintSnake(Graphics g) {
        startGame();
        Graphics2D g2 = (Graphics2D) g;
        snakeHead.paintSnakeHeadSetter(g);
        snakeSegment.paintSnakeSegmentSetter(g);
    }

    public void move() {
        System.out.println("Ok");
    }

    public void grow() {

    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?