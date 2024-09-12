package lec02;


class Square {
    public static void printSquare(int x) {
        System.out.println(x*x);
    }
}
class Square2 {
    public static void printSquare(double x) {
        System.out.println(x * x);
    }
}
// 主类 lec02的Main程序的入口点
public class Main {
    public static void main(String[] args) {
        double a = 5.0/2.0; // a = 2.5
        int b = 4/2; // b = 2
        int c = 5/2; // c = 2
        double d = 5/2; // d = 2.0
        double x = 3 / 2 + 1; // x = 2.0
        double y = 3 / (2 + 1); // y = 1.0
        System.out.println("a: "+ a + "\nb: " + b + "\nc: " + c + "\nd: " + d + "\nx: " + x + "\ny: " + y);

        a = (double)2/3; // a = 0.6666666666666666 因为根据优先级，先运算的是(double)2为2.0，再运算的是2.0/3,所以结果double类型
        b = (int)2.5; // b = 2 因为强制类型转换会直接去掉小数部分
        System.out.println("a: "+ a + "\nb: " + b);

        System.out.print("this is squeare of 5: ");
        Square.printSquare(5);
        //Square.printSquare("hello"); 会报错，因为printSquare方法的参数是int类型
        //Square.printSquare(3.5);  会报错，因为printSquare方法的参数是int类型

        System.out.print("this is squeare of 3.5: ");
        Square2.printSquare(3.5); // 12.25
        //Square2.printSquare(5); 会报错，因为printSquare方法的参数是double类型

    }
}