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
        snakeHead = new SnakeHead(60, 0);

        int num = 0;

        for(int i = 0; i < 3; i++){
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
            for(int i = snakeSegments.size(); i >= 0; i--) {

                if(i == snakeSegments.size()) {
                  snakeSegments.get(i-1).setSnakeSegmentX(snakeHead.getSnakeHeadX()); //fucking 1
                    snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);
                }
                    //input with fucking 1 number
                    snakeSegments.get(i-1).setSnakeSegmentX(snakeSegments.get(i).getSnakeSegmentX());
//                    snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(1).getSnakeSegmentX() + 20);
                    System.out.println("test");

            }
        }
    }

    public void grow () {

    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?