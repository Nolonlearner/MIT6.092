package Practice2;

public class TestCircles {
    public static void main(String[] args) {
        // 测试用例 1: 生成有效的圆
        System.out.println("Test Case 1: Generate Valid Circles");
        Point upperLeft = new Point(0, 100);
        Point lowerRight = new Point(100, 0);
        Circle[] circles = Circle.generate(10, 30, upperLeft, lowerRight); // 生成 10 个圆，最大半径 30
        System.out.println();

        // 测试用例 2: 找出最大的圆
        System.out.println("Test Case 2: Find the Largest Circle");
        if (circles != null) {
            Circle largestCircle = Circle.max(circles);
            System.out.println("Largest Circle: " + largestCircle);
        }
        System.out.println();

        // 测试用例 3: 排序圆
        System.out.println("Test Case 3: Sort Circles by Area");
        if (circles != null) {
            Circle.sort(circles);
        }
        System.out.println();

        // 测试用例 4: 错误输入测试
        System.out.println("Test Case 4: Invalid Inputs");
        Circle.generate(-5, 30, upperLeft, lowerRight); // 测试负数数量
        Circle.generate(5, -10, upperLeft, lowerRight); // 测试负数半径
        Circle.generate(5, 30, new Point(100, 100), new Point(0, 0)); // 测试无效的上下边界
        Circle.generate(5, 30, upperLeft, lowerRight);  // 有效输入再次检查

        // 测试用例 5: 查找最大圆，传入空数组
        System.out.println("Test Case 5: Find Max Circle with Empty Array");
        Circle.max(); // 测试空输入
    }
}