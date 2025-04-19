package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import java.awt.*;

public class Snake {

    public void paintSnake(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        SnakeHead snakeHead = new SnakeHead();
        SnakeSegment snakeSegment = new SnakeSegment();

        snakeHead.paintSnakeHeadSetter(g);
        snakeSegment.paintSnakeSegmentSetter(g);

    }
}
