package Practice2;
import java.util.Random;
/*
Design and implement a Circle class
– Fields (private): radius, center (represented as Point)
– A set of constructors, including a default constructor
– Getters and setters for radius and center
– getArea: compute and return the area of the circle
– toString: return the information of the circle
Design and implement three static methods
– Circle[] generate(int amount, float maxRadius, Point upperLeft, Point lowerRight)
– Circle max(Circle... circles)
– void sort(Circle[] circles)
 */

public class Circle {
    private double radius;
    private Point center;

    public Circle(){
        radius = 0;
        center = new Point();
    }

    public Circle(double r, Point c){
        radius = r;
        center = c;
    }

    public Circle(double r, int x,int y){
        radius = r;
        center = new Point(x, y);
    }

    public double getRadius(){
        return radius;
    }

    public Point getCenter(){
        return center;
    }

    public void setRadius(double r){
        radius = r;
    }

    public void setCenter(Point c){
        center = c;
    }

    public void setCenter(int x, int y){
        center = new Point(x, y);
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override // 重写toString方法
    public String toString(){
        return "Circle[radius=" + radius + ", center=(" + center.getXPos() + "," + center.getYPos() + ")]";
    }

    // 生成指定数量的圆，半径不超过maxRadius，圆心在upperLeft和lowerRight之间
    public static Circle[] generate(int amount, float maxRadius, Point upperLeft, Point lowerRight){

        // 错误处理
        if(upperLeft.getXPos() >= lowerRight.getXPos() || upperLeft.getYPos() <= lowerRight.getYPos()){
            System.out.println("Invalid input! Please make sure upperLeft is on the top left of lowerRight.");
            return null;
        }
        if(lowerRight.getXPos() - upperLeft.getXPos() < maxRadius * 2 || upperLeft.getYPos() - lowerRight.getYPos() < maxRadius * 2){
            System.out.println("Invalid input! Please make sure the distance between upperLeft and lowerRight is larger than 2 * maxRadius.");
            return null;
        }
        if(amount <= 0){
            System.out.println("Invalid input! Please make sure the amount is larger than 0.");
            return null;
        }
        if(maxRadius <= 0){
            System.out.println("Invalid input! Please make sure the maxRadius is larger than 0.");
            return null;
        }

        Circle[] circles = new Circle[amount];
        Random random = new Random();// 随机数生成器

        for(int i = 0 ; i < amount ; i++){
            double radius = random.nextDouble() * maxRadius;// 随机生成半径
            int x = random.nextInt(upperLeft.getXPos(), lowerRight.getXPos());// 随机生成x坐标
            int y = random.nextInt(lowerRight.getYPos(), upperLeft.getYPos());// 随机生成y坐标
            Point center = new Point(x, y);
            circles[i] = new Circle(radius, center);
            System.out.println("Circle " + (i+1) + ": " + circles[i] + ", Area: " + circles[i].getArea());

        }
        return circles;
    }

    // 找出最大的圆
    public static Circle max(Circle... circles){
        if(circles == null || circles.length == 0){
            System.out.println("Invalid input! Please make sure the input is not empty.");
            return null;
        }
        Circle maxCircle = circles[0];// 初始化最大圆
        for(int i = 0; i < circles.length; i++){
            if(circles[i].getArea() > maxCircle.getArea()){
                maxCircle = circles[i];
            }
        }
        System.out.println("Max Circle: " + maxCircle + ", Area: " + maxCircle.getArea());
        return maxCircle;
    }

    public static void sort(Circle[] circles){
        if(circles == null || circles.length == 0){
            System.out.println("Invalid input! Please make sure the input is not empty.");
            return ;
        }
        for(int out = 0; out < circles.length; out++){
            for(int in = 0; in < circles.length - out - 1; in++){
                if(circles[in].getArea() > circles[in + 1].getArea()){
                    Circle temp = circles[in];
                    circles[in] = circles[in + 1];
                    circles[in + 1] = temp;
                }
            }
        }
        System.out.println("Sorted circles: ");
        for(int i = 0; i < circles.length; i++) {
            System.out.println("circles " + (i + 1) + ": " + circles[i] + ", Area: " + circles[i].getArea());
        }
    }
}
