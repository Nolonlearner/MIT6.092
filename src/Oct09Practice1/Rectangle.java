package Oct09Practice1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){
        width = 0;
        height = 0;
    }

    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public String getDescription(){
        return "Rectangle with width " + width + " and height " + height + ",so the area is " + getArea();
    }
}
