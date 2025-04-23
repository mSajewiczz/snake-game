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
        snakeHead = new SnakeHead(40, 0);

        int num = 0;

        for(int i = 0; i < 2; i++){
            snakeSegments.add(new SnakeSegment(num, 0));
            num+=20;
        }

        move('m');
    }

    public void paintSnake(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        snakeHead.paintSnakeHeadSetter(g);
//        snakeSegment.paintSnakeSegmentSetter(g);
        for(SnakeSegment segment : snakeSegments) {
            //you've to invoke paint method for EACH segment!
            segment.paintSnakeSegmentSetter(g);
        }
    }

    private int i;

    public void move(char choice) {
        if(choice == 'm') {
            for(i = snakeSegments.size()+1; i >= 0; i--) {
                if(i == snakeSegments.size()) {
                    snakeSegments.get(i).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                    snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);
                } else {
                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i-1).getSnakeSegmentX());
                }
                System.out.println(i);
            }
        }
    }

    public void grow () {

    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?