package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo6_CharCaseConvert {
    static void main(String[] args) {
        // 实现字母的大小写转换,将大写字母转化为小写字母
        // A------->a
        // A和a的ascii区别是A是65,a是97,相差32
        System.out.println("请输入一个大写字母:");
        Scanner sc = new Scanner(System.in);

        // 1.定义变量记录大写的字符
        char big = sc.next().charAt(0); // charAt(0) 从字符串中取出第 1 个字符保存为char

        // 2.转成小写
        char small = (char) (big + 32); // char 参与数学运算后，结果会自动变成 int,所以需要再(char)一下
        System.out.println(small);

    }
}
