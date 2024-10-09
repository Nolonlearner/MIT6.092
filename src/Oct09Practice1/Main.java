package Oct09Practice1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4));
        shapes.add(new Circle(4.5));
        shapes.add(new Rectangle(3, 7));
        shapes.add(new Triangle(5, 6));

        if(shapes.isEmpty()){
            System.out.println("No shape!");
            return;
        }

        // 根据面积大小，对shapes进行排序
        shapes.sort((s2, s1) -> Double.compare(s1.getArea(), s2.getArea()));



        for (Shape shape : shapes) {
            System.out.println(shape.getDescription());
        }


        Shape LagestShape = ShapeAnalyzer.findLargestShape(shapes);
        if (LagestShape != null) {
            System.out.println("\nThe largest shape is: " + LagestShape.getDescription());
        }


    }
}
