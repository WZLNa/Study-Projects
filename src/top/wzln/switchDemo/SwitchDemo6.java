package top.wzln.switchDemo;

import java.util.Scanner;

public class SwitchDemo6 {
    static void main(String[] args) {
        /*
            Switch练习
            利用switch模拟计算器  + - * /
         */

        // 1.

        Scanner sc = new Scanner(System.in);
        System.out.println("输入两个数,程序将对其进行运算");
        double number1 = sc.nextDouble();

        System.out.println("你要加 or 减 or 乘 or 除?");
        String fangfa = sc.next();

        double number2 = sc.nextDouble();

        double result = switch (fangfa){
            case "加":
                yield number1 + number2;
            case "减":
                yield number1 - number2;
            case "乘":
                yield number1 * number2;
            case "除":
                yield number1 / number2;
            default:
                yield 0;
        };
        System.out.println("计算结果是"+result);

    }
}
