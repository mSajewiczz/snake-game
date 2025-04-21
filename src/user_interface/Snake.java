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
//        snakeSegments.add(new SnakeSegment(40, 0)); //for head
//        snakeSegments.add(new SnakeSegment(20, 0));
//        snakeSegments.add(new SnakeSegment(0, 0)); //for 1st segment

        for(int i = 0; i < 2; i++){
            snakeSegments.add(new SnakeSegment(num, 0));
            num+=20;
        }
        move();
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

    public void move() {
        System.out.println("move were invoked!");

        //test version of moving - just add 20px in x cordinate
    int i = 0;

       for(i = 0; i < snakeSegments.size(); i++) {
           snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX()+10);
           snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i).getSnakeSegmentX()+20);
       }


    }

    public void grow() {

    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?