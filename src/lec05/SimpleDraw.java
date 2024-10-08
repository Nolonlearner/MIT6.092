package lec05;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleDraw extends JPanel implements Runnable {
    private static final long serialVersionUID = -7469734580960165754L;
    private boolean animate = true;
    private final int FRAME_DELAY = 50;
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    private DrawGraphics draw;

    public SimpleDraw(DrawGraphics drawer) {
        this.draw = drawer;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        draw.draw(g2);
    }

    public synchronized void start() {
        animate = true;
    }

    public synchronized void stop() {
        animate = false;
    }

    private synchronized boolean animationEnabled() {
        return animate;
    }

    public void run() {
        while (true) {
            if (animationEnabled()) {
                repaint();
            }
            try {
                Thread.sleep(FRAME_DELAY);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String args[]) {
        final SimpleDraw content = new SimpleDraw(new DrawGraphics());
        JFrame frame = new JFrame("Graphics!");
        Color bgColor = Color.white;
        frame.setBackground(bgColor);
        content.setBackground(bgColor);
        content.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setContentPane(content);
        frame.setResizable(false);
        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
            public void windowDeiconified(WindowEvent e) { content.start(); }
            public void windowIconified(WindowEvent e) { content.stop(); }
        });
        new Thread(content).start();
        frame.setVisible(true);
    }
}
