package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo12 {
    static void main(String[] args) {
        /*
            需求1:
                键盘录入一个四位整数,判断这个数字是否是回文数
            需求2:
                寻找7的有缘数,定义一个两位整数,只要该数字包含7或者是7的倍数,就是有缘数
         */
        Scanner sc = new Scanner(System.in);

        // 需求1:键盘录入一个四位整数,判断这个数字是否是回文数
        System.out.println("现在请定义一个4位整数,程序将判断这个数字是否是回文数");
        int one = sc.nextInt();
        // 提取个位
        int one_gewei = one % 10;
        // 提取十位
        int one_shiwei = one / 10 % 10;
        // 提取百位
        int one_baiwei = one / 100 % 10;
        // 提取千位
        int one_qianwei = one / 1000;
        if (one_shiwei == one_baiwei & one_gewei == one_qianwei){
            System.out.println( one + "是回文数");
        }else{
            System.out.println( one + "不是回文数");
        }

    }
}
