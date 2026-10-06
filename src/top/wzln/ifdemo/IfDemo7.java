package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo7 {
    static void main(String[] args) {
        /*
            牛客算法题,卡拉兹函数,定义如下:
            给定正整数n,
                若n为奇数,则 f(n) = 3n+1
                若n为偶数,则 f(n) = n/2
                奇数是不能被2整除的数,偶数相反

            示例1:
                输入:1
                说明:奇数,3*1+1=4
                输出:4
            示例2:
                输入:2
                说明:偶数,2 / 2 =1
                输出:1
         */

        // 定义一个整数并判断是否是个正数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int type = sc.nextInt();
        int ftype = 0;

        // 判断逻辑
        if (type >= 0){
            // 奇数是不能被2整除的数,偶数相反
            if (type % 2 == 0){
                ftype = type / 2;
                System.out.println("你输入的是一个偶数,fn为" + ftype);
            }else {
                ftype = 3 * type + 1;
                System.out.println("你输入的是一个奇数,fn为" + ftype);
            }
        }else{
            System.out.println("请输入一个正整数!而不是负的");
        }
    }
}
