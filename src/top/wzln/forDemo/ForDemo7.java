package top.wzln.forDemo;

import java.util.Scanner;

public class ForDemo7 {
    static void main(String[] args) {
        /*
            for循环算法题(难度递增) 第六题
            计算以下数列前n项的和:
            S(n) = 1-2+3-4+5-6+7-8.............

            拆解:
            S(n) = +1 -2 +3 -4 +5 -6 +7 -8.............
                    ^  ^  ^  ^  ^  ^  ^  ^
                    a  a  a  a  a  a  a  a
            (奇数就进行加操作,偶数就进行减操作)

            示例1:
            输入:4
            说明: S(4) = 1-2+3-4 = -2
            输出:-2

         */

        Scanner sc = new Scanner(System.in);
        System.out.print("你要求前几项的和?: ");
        int num = sc.nextInt();
        int a = 1;
        int result = 0; //定义求和变量

        for (int i = 0; i < num; i++) {

            if (a % 2 == 0) {  //或者int i改成1,去掉a
                result = result - a; //当是偶数的时候 就执行减操作
                a++; //变成奇数
            } else {
                result = result + a; //当是奇数的时候 就执行加操作
                a++; //变成偶数
            }

        }
        System.out.println(result);
    }
}
