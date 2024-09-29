package lec05;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;

    public DrawGraphics() {
        boxes = new ArrayList<>();
        BouncingBox box1 = new BouncingBox(50, 50, Color.RED);
        box1.setMovementVector(1, 2);
        BouncingBox box2 = new BouncingBox(100, 100, Color.GREEN);
        box2.setMovementVector(2, 1);
        BouncingBox box3 = new BouncingBox(150, 150, Color.BLUE);
        box3.setMovementVector(1, -1);

        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
    }

    public void draw(Graphics surface) {
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }

        // 绘制额外的形状（例如椭圆、线条、矩形等）
        surface.setColor(Color.BLACK);
        surface.drawLine(50, 50, 250, 250);

        surface.setColor(Color.RED);
        surface.drawRect(20, 20, 50, 50);

        surface.setColor(Color.GREEN);
        surface.drawOval(100, 100, 60, 40);
    }
}
