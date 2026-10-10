package top.wzln.whileDemo;

import java.util.Scanner;

/*
    给定一个整数n,请计算其所有数位之和

    示例1
    输入:12
    说明:1+2=3
    输出:3

    示例2
    输入:-305
    说明:获取绝对值305,再求和3+0+5
    输出:8
 */
public class whileDemo5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("现在请输入一个整数n,程序将计算其所有数位之和");
        int n = sc.nextInt();
        int n_length = (n + "").length();
        int result = 0; //存放和

        if (n >= 0) {  // n大于等于0的逻辑

            for (int i = 0; i < n_length; i++) {
                int a = n % 10; //取最后一位
                result = a + result;
                n = n / 10; // 去掉一位
            }

        } else {  // n小于0的逻辑

            n = -n; //取绝对值
            for (int i = 0; i < (n_length - 1); i++) {  //n_length要去掉负号
                int a = n % 10; //取最后一位
                result = a + result;
                n = n / 10; // 去掉一位
            }
        }

        System.out.println(result);


    }
}
