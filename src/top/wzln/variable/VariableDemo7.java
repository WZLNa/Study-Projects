package top.wzln.variable;

import java.util.Scanner;

public class VariableDemo7 {
    static void main(String[] args) {
        // 定义两个整数类型的变量num1和num2,键盘录入数据分别为两个变量赋值
        // 求两个数的和并打印
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.println(num3);
    }
}
