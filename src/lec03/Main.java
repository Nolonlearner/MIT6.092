package lec03;

/**
 * Main class for lec03
 * The good style for Java programming
 * 1. Use a meaningful class name and variable name
 * 2. Use indentation to make the code readable(ctrl + shift + F to format the code)
 * 3. Use the whitespaces or print the blank lines to improve the readability
 * 4. Use the comments to explain the code
 * 5. Do not duplicate tests
 */

public class Main {
    public static void main(String args[]){
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("The values array content: "+ values[0] + " " + values[1] + " " + values[2] + " " + values[3] + " " + values[4]);
        //int[] values2 = {1.1, 14, 3, 4, 5};// 会报错，因为数组的类型是int，不能存放double类型的数据
        int size = 8;
        int[] values2 = new int[size];
        String str = "The values2 array content: ";
        for(int i = 0;i< values2.length;i++){
            values2[i] = i * i;
            str += values2[i] + " ";
        }
        System.out.println( str);
        System.out.println("The length of values2 is: " + values2.length);


        System.out.println("The length of args: " + args.length);
        /*
        System.out.println("The first element of args: " + args[0]);
        System.out.println("The second element of args: " + args[1]);
        此处代码需要在命令行自己输入参数，否则会报错
        */

        //this is Assignment 3
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        String fastMan = "default";//设置一个默认值
        int fastTime = 1000000;//设置一个很大的数
        System.out.println("The names and times of the runners are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
            if(fastTime>times[i]){
                fastTime = times[i];
                fastMan = names[i];
            }
        }
        System.out.println("The fastest man is: " + fastMan + ", the fastest time is: " + fastTime);
    }

}
