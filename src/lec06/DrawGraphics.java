package lec06;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;
    ArrayList<Circle> circles;
    Random rand;

    public DrawGraphics() {
        rand = new Random();
        boxes = new ArrayList<>();
        circles = new ArrayList<>();

        // 初始化随机方向的矩形
        BouncingBox box1 = new BouncingBox(50, 50, Color.RED);
        box1.setMovementVector(randomDirection(), randomDirection());
        BouncingBox box2 = new BouncingBox(100, 100, Color.GREEN);
        box2.setMovementVector(randomDirection(), randomDirection());
        BouncingBox box3 = new BouncingBox(150, 150, Color.BLUE);
        box3.setMovementVector(randomDirection(), randomDirection());
        BouncingBox box4 = new BouncingBox(5, 5, Color.YELLOW);
        box4.setMovementVector(randomDirection(), randomDirection());
        BouncingBox box5 = new BouncingBox(10, 100, Color.GRAY);
        box5.setMovementVector(randomDirection(), randomDirection());
        BouncingBox box6 = new BouncingBox(200, 200, Color.BLACK);
        box6.setMovementVector(randomDirection(), randomDirection());

        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);
        boxes.add(box6);

        // 初始化随机方向的圆形
        Circle circle1 = new Circle(70, 70, Color.ORANGE, 20);
        circle1.setMovementVector(randomDirection(), randomDirection());
        Circle circle2 = new Circle(200, 200, Color.PINK, 30);
        circle2.setMovementVector(randomDirection(), randomDirection());
        Circle circle3 = new Circle(30, 300, Color.CYAN, 25);
        circle3.setMovementVector(randomDirection(), randomDirection());

        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
    }

    public void draw(Graphics surface) {
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
        for (Circle circle : circles) {
            circle.draw(surface);
        }
    }


    // 随机方向的生成
    private int randomDirection() {
        return rand.nextInt(5) - 2; // 产生 -2 到 2 之间的随机整数
    }
}
