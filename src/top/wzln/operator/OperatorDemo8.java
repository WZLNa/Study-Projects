package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    static void main(String[] args) {
        /*
        练习1:键盘录入小a和小b的身高,比一比谁更高?

        练习2:键盘录入一个三位数,判断是否能被3整除

        */
        Scanner sc = new Scanner(System.in);
        // 练习1
        System.out.println("判断a比不比b高");
        System.out.println("请输入a的身高:");
        double a = sc.nextDouble();
        System.out.println("请输入b的身高:");
        double b = sc.nextDouble();
        // 比较身高
        boolean result = a >= b;
        System.out.println(result);
    }

}
