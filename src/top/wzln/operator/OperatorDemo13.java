package top.wzln.operator;

import java.util.Scanner;

public class OperatorDemo13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 需求2:寻找7的有缘数,定义一个两位整数,只要该数字包含7或者是7的倍数,就是有缘数
        System.out.println("现在请定义一个2位整数,程序将判断该数是不是7的有缘数");
        int two = sc.nextInt();
        // 提取个位
        int two_gewei = two % 10;
        // 提取十位
        int two_shiwei = two / 10; // int类型计算中如果有小数会自动舍弃小数部分
        if (two_gewei == 7 | two_shiwei == 7){
            System.out.println("该数包含7,是有缘数");
        }else{
            if (two % 7 ==0){
                System.out.println("该数可以整除7,是7的倍数,是有缘数");
            }else{
                System.out.println("该数不包含7也不能被7整除,不是7的有缘数");
            }
        }

        // 需求2 做法2
        if (two_gewei == 7 | two_shiwei == 7 | two % 7 ==0){
            System.out.println("该数包含7或能被7整除,是有缘数");
        }else{
                System.out.println("该数不包含7也不能被7整除,不是7的有缘数(做法二)");
        }
    }
}
