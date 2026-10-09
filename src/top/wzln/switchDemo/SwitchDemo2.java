package top.wzln.switchDemo;

import java.util.Scanner;

public class SwitchDemo2 {
    static void main(String[] args) {
        /*
            Switch的其他知识点
            1.default的位置和省略
                位置：case和default没有标准的上下之分，位置可以任意的书写
                    为了观看比较方便,提高代码的阅读性
                    一般来讲,case是从小到大依次书写的,default是写在最下面的
                省略:
                default是可以忽略不写的,但是如果所有的case都不匹配,则没有输出结果

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询星期几");
        int week = sc.nextInt();

        // switch选择阶段
        switch (week){
            case 4:
                System.out.println("星期四");
                break;
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            default: // 一般建议在最下面
                System.out.println("请输入正确的数字!");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
    }
}
