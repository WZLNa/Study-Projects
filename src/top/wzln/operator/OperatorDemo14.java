package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo14 {
    static void main(String[] args) {
        // 利用三元运算符,求两个整数的较大值

        // 1.定义两个整数
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 2.利用三元运算符,求两个整数的较大值
        // 格式:  关系表达式 ? 表达式1:表达式2 , 关系表达式为真就执行表达式1,如果为假就执行表达式2
        int max = num1 > num2 ? num1 : num2; // 如果大于输出1,如果小于输出2
        System.out.println(max);

    }
}
