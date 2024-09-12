package lec02;

class newline {
    public static void printNewLine() {
        System.out.println();
    }
}
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
class FooCoporation{
    public static double totalPay(double BasePay, int HoursWorked){
        double totalPay = 8.0;
        System.out.println("The worker's BasePay: " + BasePay + " HoursWorked: " + HoursWorked);
        if(BasePay < 8.0){
            System.out.println("Error: Base Pay is below the minimun wage that 8$ per hour");
            return 0.0;
        }
        else if (HoursWorked > 60){
            System.out.println("Error: Hours worked exceeds 60 hours");
            return 0.0;
        }
        else{
            if(HoursWorked > 40){
                totalPay = BasePay * 40 +(HoursWorked - 40) * BasePay * 1.5;
            }
            else{
                totalPay = BasePay * HoursWorked;
            }
            System.out.println("The worker's total pay is: " + totalPay);
            return totalPay;
        }
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

        System.out.println("Now we begin to finish the task of lec02");
        FooCoporation test = new FooCoporation();
        test.totalPay(7.5, 35); // 262.5
        newline.printNewLine();
        test.totalPay(8.2, 47); // 401.4
        newline.printNewLine();
        test.totalPay(10.0, 73); // 730.0
        newline.printNewLine();
        test.totalPay(9, 54); // 0.0

        // 以上因为实例引用了一个类会报warning，所以需要实例化一个对象，然后调用对象的方法，如下：
        double pay = FooCoporation.totalPay(8.2,47);//通过类名访问静态方法


    }
}