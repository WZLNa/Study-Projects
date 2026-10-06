package top.wzln.weekend_homework.Week1;

import java.util.Scanner;

public class Week1Huiwenshu {
    static void main(String[] args) {
        // 需求:键盘录入一个整数,判断这个数字是否是回文数
        // 考验核心:数字翻转算法
        Scanner sc = new Scanner(System.in);
        System.out.println("请键盘录入一个整数,程序将判断这个数字是否是回文数");
        int num = sc.nextInt();
        int original = num; //存储原始数字
        int reverse = 0; //初始化定义reverse变量,用来存放反转后的数字

        // 获取反转数(核心算法)
        while(num > 0){
            int digit = num % 10; // 获取最后一位
            reverse = reverse * 10 + digit; // 把新的最后
            num = num / 10;
        }

        // 处理获取到反转数后的逻辑
        if (reverse == original){
            System.out.println(original + "是一个回文数");
        } else {
            System.out.println(original + "不是一个回文数");
        }

    }
}
