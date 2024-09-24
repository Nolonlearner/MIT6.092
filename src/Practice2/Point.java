package Practice2;

/*
Design and implement a Point class
– Fields (private): xPos, yPos
– A set of constructors, including a default constructor
– Getters and setters for xPos and yPos
 */
public class Point {
    private int xPos;
    private int yPos;

    public Point(){
        xPos = 0;
        yPos = 0;
    }

    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public int getXPos(){
        return xPos;
    }

    public int getYPos(){
        return yPos;
    }
}
