package Oct09Practice1;
import java.util.List;

public class ShapeAnalyzer {
    public static <T extends Shape> T findLargestShape(List<T> shapes)
    {
        if(shapes.isEmpty())
            return null;
        T largest = shapes.get(0); //把第一个元素设为最大的
        for(int i = 1; i < shapes.size(); i++)
        {
            if(shapes.get(i).compareTo(largest) > 0)
                largest = shapes.get(i);
        }
        return largest;
    }
}
