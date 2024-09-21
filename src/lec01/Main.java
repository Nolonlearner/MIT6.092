// Main.java
package lec01; // 定义包名为 lec01

import java.util.Scanner; // 导入 Scanner 类，用于接收用户输入

// DoMath 类，用于执行简单的数学计算
class DoMath {
    public static void calculate() {
        double score = 1.0 + 2.0 * 3.0; // 计算 1 + 2 * 3
        System.out.println(score); // 输出计算结果
        score = score / 2.0; // 将 score 除以 2
        System.out.println(score); // 输出新的 score 值
    }
}

// DoMath2 类，用于执行另一种数学计算
class DoMath2 {
    public static void calculate() {
        double score = 1.0 + 2.0 * 3.0; // 计算 1 + 2 * 3
        System.out.println(score); // 输出计算结果
        double copy = score; // 将 score 的值复制到 copy
        copy = copy / 2.0; // 将 copy 除以 2
        System.out.println(copy); // 输出 copy 的值
        System.out.println(score); // 再次输出 score 的值
    }
}

// GravityCalculator 类，用于计算物体在重力作用下的位置
class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // 地球的重力加速度，单位是 m/s^2（向下）
        double initialVelocity = 0.0; // 初始速度，单位是 m/s
        double fallingTime = 10.0; // 自由落体时间，单位是秒
        double initialPosition = 0.0; // 初始位置，单位是米
        double finalPosition = 0.0; // 最终位置，初始化为 0

        // 输出物体在 fallingTime 秒后的位置（当前没有计算逻辑，结果始终为 0）
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}

// 主类 main，程序的入口点
public class Main {
    public static void main(String[] args) {
        // 打印欢迎信息
        String str;
        str = "Hello World!";
        System.out.println(str);

        // 打印布尔值
        boolean b = true;
        System.out.println(b);

        // 打印整数值
        int i = 123;
        System.out.println(i);

        // 打印浮点数值
        double d = 3.14;
        System.out.println(d);

        // 执行数学计算
        System.out.println("this is math calculation");
        DoMath.calculate(); // 调用 DoMath 的计算方法
        DoMath2.calculate(); // 调用 DoMath2 的计算方法

        // 调用 GravityCalculator 的 main 方法
        System.out.println("this is gravity calculation");
        GravityCalculator.main(null); // 传递 null 以调用 GravityCalculator 的 main 方法

        // 创建 Scanner 对象以接收用户输入
        Scanner scanner = new Scanner(System.in);
        double gravity = 9.8; // 地球的重力加速度，单位是 m/s^2（向上）
        double initialVelocity = 0.0; // 初始速度，单位是 m/s
        double initialPosition = 0.0; // 初始位置，单位是米
        System.out.println("gravaity is " + gravity + ", initialVelocity is " + initialVelocity +", initialPosition is " + initialPosition);

        // 提示用户输入自由落体时间
        System.out.print("Please enter falling time: ");
        double fallingTime = scanner.nextDouble(); // 从控制台读取用户输入的时间

        // 计算并输出最终位置
        System.out.print("The final position : ");
        double finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
        System.out.println(finalPosition); // 输出最终位置

        // 关闭 Scanner 对象以释放资源
        scanner.close();
    }
}