package lec06;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle {
    int x;
    int y;
    Color color;
    int diameter;
    int xDirection = 0;
    int yDirection = 0;

    public Circle(int startX, int startY, Color startColor, int diameter) {
        x = startX;
        y = startY;
        color = startColor;
        this.diameter = diameter;
    }

    public void draw(Graphics surface) {
        surface.setColor(color);
        surface.fillOval(x - diameter / 2, y - diameter / 2, diameter, diameter);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(x - diameter / 2, y - diameter / 2, diameter, diameter);

        x += xDirection;
        y += yDirection;

        // 边界检测和碰撞反弹
        if ((x - diameter / 2 <= 0 && xDirection < 0) || (x + diameter / 2 >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y - diameter / 2 <= 0 && yDirection < 0) || (y + diameter / 2 >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }
}
