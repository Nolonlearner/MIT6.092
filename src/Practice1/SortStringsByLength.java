package Practice1;
import java.util.ArrayList; // 导入 ArrayList 类
import java.util.Scanner; // 导入 Scanner 类


public class SortStringsByLength { // 定义一个公共类
    public static void main(String[] args) { // 主方法，程序入口
        //1.首先接受用户输入的字符串
        Scanner scanner = new Scanner(System.in);// 创建一个 Scanner 对象，用于接收用户输入
        ArrayList<String> strings = new ArrayList<>(); // 创建一个 ArrayList 对象，用于存储字符串
        System.out.println("请输入字符串，输入exit代表结束输入");// 提醒用户输入字符串

        //2.将用户输入的字符串存储到 ArrayList 中
        while(true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){ // 如果用户输入 exit，则结束输入
                break;
            }
            strings.add(input);
        }

        //3.按字符串长度对 ArrayList 中的字符串进行冒泡排序，如果长度相同则按字典序排序
        for(int out = 0; out < strings.size(); out++){
            for(int in = 0; in < strings.size() - out - 1; in++){
                if(strings.get(in).length() > strings.get(in + 1).length()){
                    String temp = strings.get(in);
                    strings.set(in, strings.get(in + 1));
                    strings.set(in + 1, temp);
                }
                else if(strings.get(in).length() == strings.get(in + 1).length()){// 如果长度相同则按字典序排序
                    if(strings.get(in).compareToIgnoreCase(strings.get(in + 1)) > 0){
                        String temp = strings.get(in);
                        strings.set(in, strings.get(in + 1));
                        strings.set(in + 1, temp);
                    }
                }
            }
        }

        //4.输出排序后的字符串
        System.out.println("排序后的字符串为：");
        for(int i =0 ; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        scanner.close();
    }
}