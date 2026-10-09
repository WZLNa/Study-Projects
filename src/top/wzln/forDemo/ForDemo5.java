package top.wzln.forDemo;

import java.util.Scanner;

/*
    for循环算法题(难度递增) 第四题
    需求:在键盘录入两个数字,表示一个范围
        统计这个范围中,
        既能被3整除,又能被5整除数字有多少个?


 */
public class ForDemo5 {
    static void main(String[] args) {
        int result = 0; //定义result记录统计结果
        Scanner sc = new Scanner(System.in);
        System.out.print("输入数字1:");
        double number1 = sc.nextDouble();
        System.out.print("输入数字2:");
        double number2 = sc.nextDouble();
        double max = 0;
        double min = 0;

        if (number1 != number2) {

//            if (number1 > number2){
//                max = number1;
//                min = number2; // 不要忘记赋值
//            }else {
//                min = number1;  // 注意谁小谁大
//                max = number2;
//            }
            max = number1 > number2 ? number1 : number2;
            min = number1 < number2 ? number1 : number2;

            for (double i = min; i <= max; i++) {
                System.out.println(i);
                if (i % 3 == 0 && i % 5 == 0) {
                    result++;
                }
            }
            System.out.println("既能被3整除,又能被5整除的数字有" + result + "个");


        } else {
            System.out.println("两数不能相等!");
        }

    }

}
