package top.wzln.variable;

// 确定Scanner的位置
import java.util.Scanner;

public class VariableDemo6_ScannerInput {
    static void main(String[] args) {
        /*
            键盘录入:
                第一步:找到Scanner这个打工人
                第二步:让Scanner干活
         */

        // 1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);

        // 2. 让Scanner干活
        // 接收键盘录入的整数
        int num = sc.nextInt();
        System.out.println(num);

        // 接收键盘录入的小数
        double num2 = sc.nextDouble();
        System.out.println(num2);

        // 接收键盘录入的文本
        String str = sc.next();
        System.out.println(str);
    }
}
