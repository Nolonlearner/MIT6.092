package Practice1;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string (spaces will be ignored): ");
        String input = scanner.nextLine();
        scanner.close();
        int[] frequency = new int[256]; // 字符范围为 ASCII 码 0-255

        //初始化频率数组
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = 0;
        }

        // 统计字符出现的次数
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // 获取字符
            if (c != ' ') { // 忽略空格
                frequency[c]++; // 统计字符出现的次数
            }
        }

        // 创建一个字符和频率的关联数组
        char[] characters = new char[256];
        int[] counts = new int[256];
        int index = 0;

        // 收集出现的字符和其频率
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // 只收集出现过的字符
                characters[index] = (char) i;
                counts[index] = frequency[i];
                index++;
            }
        }

        // 根据次数排序
        for (int out = 0; out < index; out++) {
            for (int in = 0; in < index - out - 1; in++) {
                if (counts[in] < counts[in + 1]) { // 排序频率
                    // 交换频率
                    int tempCount = counts[in];
                    counts[in] = counts[in + 1];
                    counts[in + 1] = tempCount;

                    // 交换字符
                    char tempChar = characters[in];
                    characters[in] = characters[in + 1];
                    characters[in + 1] = tempChar;
                }
            }
        }

        // 输出结果
        System.out.println("Character frequency sorted result: ");
        for (int i = 0; i < index; i++) {
            System.out.println(characters[i] + " : " + counts[i]); // 输出字符和对应频率
        }
    }
}