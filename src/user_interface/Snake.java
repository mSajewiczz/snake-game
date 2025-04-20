package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    ArrayList<SnakeSegment> snakeSegments = new ArrayList<SnakeSegment>();

    public void paintSnake(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        SnakeHead snakeHead = new SnakeHead();
        SnakeSegment snakeSegment = new SnakeSegment();

        snakeHead.paintSnakeHeadSetter(g);
        snakeSegment.paintSnakeSegmentSetter(g);
    }

    public void move() {

    }

    public void grow() {

    }
}
