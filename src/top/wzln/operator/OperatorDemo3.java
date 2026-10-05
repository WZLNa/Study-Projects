package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    static void main(String[] args) {
        /*
            给定秒数seconds,将其转换为对应的小时数 分钟数和秒数,使得总时间不变,但分钟数和秒数都不超过59.

            一小时是3600秒,一分钟是360秒
         */
        Scanner sc = new Scanner (System.in);
        System.out.println("输入秒数seconds:");
        int type = sc.nextInt();
        int hour = type / 3600;
        int minute = type % 3600 / 60;
        int second = type % 3600 % 60;
        System.out.println("小时数:" + hour + " 分钟数:" + minute + " 秒数:" + second);
    }
}
