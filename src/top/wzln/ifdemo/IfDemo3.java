package top.wzln.ifdemo;

public class IfDemo3 {
    static void main(String[] args) {
        /*
            if的细节:
                1.If语句大括号的位置
                    左括号写在上一行的末尾，不要单独写一行

                    K&R风格(紧凑风):左括号在上一行的末尾
                    Allman风格(折叠风):左括号另起一行

                2.If语句大括号的省略
                    如果大括号中语句体只有一行，大括号可以省略(Java会把距离他最近的那样代码当做语句体)

                    if (tempature >= 38.0) System.out.println("您的体温过高!");

                3.小括号后面不能有分号
                    小括号后面不能有分号，这样会拆开if的语句结构
                4.判断布尔类型的变量
                    判断布尔类型的变量，直换把变量写在小括号中即可
         */

        // 1.定义一个变量
        double tempature = 39.0;

        // 2.对变量进行判断
        if (tempature >= 38.0) {
            System.out.println("您的体温过高!");
        }

    }
}
