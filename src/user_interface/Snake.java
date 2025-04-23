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

    private int i = 0;

    public void move(char choice) {
//        System.out.println("move were invoked!");
        //test version of moving - just add 20px in x cordinate
        if (i == snakeSegments.size()) {
            i = 0;
        }

        if (choice == 'm') {
            //this way is only for tests of moving
//            snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX()+10);
//            snakeSegments.get(i).setSnakeSegmentX(snakeSegments.get(i).getSnakeSegmentX()+20);
            //exact way of doing that method
            snakeSegments.get(i).setSnakeSegmentX(snakeHead.getSnakeHeadX());
            snakeSegments.get(i).setSnakeSegmentY(snakeHead.getSnakeHeadY());
            snakeHead.setSnakeHeadX(snakeHead.getSnakeHeadX() + 20);
        } else if (choice == 'd') {
            if (i == 1) {
                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY() + 20);

                snakeSegments.get(i).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(i).setSnakeSegmentY(snakeHead.getSnakeHeadY());
            } else {
                snakeSegments.get(i).setSnakeSegmentX(snakeHead.getSnakeHeadX());
                snakeSegments.get(i).setSnakeSegmentY(snakeHead.getSnakeHeadY());
            }
            i += 1;

//        else if(choice == 'u') {
//            for(i = 0; i < snakeSegments.size(); i++) {
//                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY()+10);
//                snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i).getSnakeSegmentY()+20);
//            }
//        } else if(choice == 'd') {
//            for(i = 0; i < snakeSegments.size(); i++) {
//                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY()-10);
//                snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i).getSnakeSegmentY()-20);
//            }
//        } else if(choice == 'r') {
//            for(i = 0; i < snakeSegments.size(); i++) {
//                snakeHead.setSnakeHeadY(snakeHead.getSnakeHeadY()-10);
//                snakeSegments.get(i).setSnakeSegmentY(snakeSegments.get(i).getSnakeSegmentY()-20);
//            }
//        }
        }
    }

    public void grow () {

    }
}

//SnakeSegment snakeSegment = new SnakeSegment(); i tu podaje x, y w () z tej tablicy zaciagniete?