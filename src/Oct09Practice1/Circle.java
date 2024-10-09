package Oct09Practice1;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 0;
    }

    public Circle(double r){
        radius = r;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription(){
        return "Circle with radius " + radius + ",so the area is " + getArea();
    }

}
