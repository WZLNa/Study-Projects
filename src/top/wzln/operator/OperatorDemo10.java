package top.wzln.operator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class OperatorDemo10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 练习1:输入一个整数，程序将判断其是否在1-10之间
        System.out.println("现在请输入一个整数，程序将判断其是否在1-10之间：");
        int one = sc.nextInt();
        boolean results1 = 1 < one & one<10;
        if (results1){
            System.out.println("在");
        }else{
            System.out.println("不在");
        }

    }
}
