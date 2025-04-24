package user_interface;

import logic.SnakeHead;
import logic.SnakeSegment;

import java.awt.*;
import java.util.ArrayList;

public class Snake {

    ArrayList<SnakeSegment> snakeSegments = new ArrayList<>();

    SnakeHead snakeHead;
    SnakeSegment snakeSegment;
    private String direction = "right";

    public void startGame() {
        snakeHead = new SnakeHead(60, 0);

        int num = 20;

        for(int i = 0; i < 2; i++){
            snakeSegments.add(new SnakeSegment(num, 0));
            num+=20;
        }

        System.out.println("snakeSegments.size() = " + snakeSegments.size());

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

    public void move(char choice) {


        if(choice == 'm') {
            //here is only for right
            //you need to have DEFAULT function for all dimensions
            if(direction.equals("right")) {
                for (int i = snakeSegments.size() - 1; i > 0; i--) {
                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
                    snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
                }
                snakeSegments.get(0).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(0).setSnakeSegmentY(snakeHead.getSnakeHeadY());
                snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);
            } else if(direction.equals("down")) {
                for (int i = snakeSegments.size() - 1; i > 0; i--) {
                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
                    snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
                }
                snakeSegments.get(0).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(0).setSnakeSegmentY(snakeHead.getSnakeHeadY());
                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() + 20);
            } else if(direction.equals("up")) {
                for (int i = snakeSegments.size() - 1; i > 0; i--) {
                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
                    snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
                }
                snakeSegments.get(0).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(0).setSnakeSegmentY(snakeHead.getSnakeHeadY());
                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() - 20);
            } else if(direction.equals("left")) {
                for (int i = snakeSegments.size() - 1; i > 0; i--) {
                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i - 1).getSnakeSegmentX());
                    snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i - 1).getSnakeSegmentY());
                }
                snakeSegments.get(0).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(0).setSnakeSegmentY(snakeHead.getSnakeHeadY());
                snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() - 20);
            }
        }
    }

    public void grow () {

    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?