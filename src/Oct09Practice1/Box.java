package Oct09Practice1;

public class Box extends Rectangle{

    public Box(){
        super();
    }

    public Box(double edge){
        super(edge, edge);
    }

    @Override
    public double getArea(){
        return super.getArea();
    }


    @Override
    public String getDescription(){
        return "Box with edge " + super.getHeight() + ",so the area is " + getArea();
    }
}
