package top.wzln.operator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class OperatorDemo11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 练习2:输入一个整数，程序将判断其是否不在1-10之间
        System.out.println("现在请输入一个整数，程序将判断其是否不在1-10之间:");
        int two = sc.nextInt();
        boolean results2 = two < 1 | two > 10;
        if (results2){
            System.out.println("这个数不在1-10之间");
        }else{
            System.out.println("这个数在1-10之间");
        }
    }
}
