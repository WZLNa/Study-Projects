package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    static void main(String[] args) {
        /*
            需求：键盘录入一个三位数，将其拆分为个位 十位 百位后，打印在控制台
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("现在请输入一个三位数，程序将将其拆分为个位 十位 百位后，打印在控制台：");
        int type = sc.nextInt();
        int gewei = type % 10;
        int shiwei = type / 10 % 10; // 123除以10等于12(特性只保留整数),12在除10取余
        int baiwei = type / 100;

        System.out.println("它的百位是:" + baiwei);
        System.out.println("它的十位是:" + shiwei);
        System.out.println("它的个位是:" + gewei);

    }
}
