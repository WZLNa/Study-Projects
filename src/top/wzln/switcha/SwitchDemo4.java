package top.wzln.switcha;

import java.util.Scanner;

public class SwitchDemo4 {
    static void main(String[] args) {
        /*
            根据用户输入的月份,输出季节(switch版)

                春季: 3 - 5 月
                夏季: 6 - 8 月
                秋季: 9 - 11 月
                冬季: 12 1 2月

         */

        // 1.定义一个变量记录用户输入的月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份,程序将判断它的季节:");
        int month = sc.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6,7,8:  //这种写法也可以
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("请输入一个正确的月份!");
        }
    }
}
