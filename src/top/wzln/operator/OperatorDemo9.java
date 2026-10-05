package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo9 {
    static void main(String[] args) {
        /*
            练习2:键盘录入一个整数,判断能否被3整除.
         */

        // 做法一:
        // 1.提取各位数字
        Scanner sc = new Scanner(System.in);
        System.out.println("现在请输入一个三位数，判断能否被3整除");
        int type = sc.nextInt();
        int gewei = type % 10;
        int shiwei = type / 10 % 10; // 123除以10等于12(特性只保留整数),12在除10取余
        int baiwei = type / 100;

        // 2.计算数字和
        int he = gewei + shiwei + baiwei;

        // 3.判断整除性
        // 若 he % 3 == 0 -->该数能被3整除
        // 若 he % 3 != 0 -->该数不能被3整除
        if (he % 3 == 0) {
            int one = type / 3;
            System.out.println("该数能被3整除(做法一)" + one);
        }else{
            System.out.println("该数不能被3整除(做法一)");}

        // 做法二:
        if(type % 3 == 0){
            int two = type / 3;
            System.out.println("该数能被3整除(做法二)" + two);
        }else{
            System.out.println("该数不能被3整除(做法二)");
        }

    }
}
