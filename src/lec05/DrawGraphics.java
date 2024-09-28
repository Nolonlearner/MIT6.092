package lec05;

import java.awt.Color;
import java.awt.Graphics;
public class DrawGraphics {
    BouncingBox box;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.BLACK);
    }
    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box.draw(surface);

        surface.drawOval(100, 100, 50, 50);
        box.draw(surface);

        surface.fillRect(10, 10, 50, 50);
        box.draw(surface);
    }
}