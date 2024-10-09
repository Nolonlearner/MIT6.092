package Oct09Practice1;

public class Triangle extends Shape{
    public double base;
    public double height;

    public Triangle(){
        base = 0;
        height = 0;
    }

    public Triangle(double b, double h){
        base = b;
        height = h;
    }

    @Override
    public double getArea(){
        return 0.5 * base * height;
    }

    @Override
    public String getDescription(){
        return "Triangle with base " + base + " and height " + height + ",so the area is " + getArea();
    }
}
