package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo6 {
    static void main(String[] args) {

        /*
            需求:小明在每次订外卖都会在多家平台进行对比,看谁的优惠力度更大
                已知:
                    饱了么App:全场9折优惠
                    美单App:满30减10元
                请问1:
                    小明买了一顿烧烤50元,在哪家下单更划算
                请问2:
                    如果价格不确定,数据由键盘录入而来呢?

             细节:变量的定义只在它所属的那个大括号中是有效的

         */

        // 请问1 小明买了一顿烧烤50元,在哪家下单更划算
        int paid = 50;

        // 计算2个app优惠后的价格
        double blm = paid * 0.9;
        double md = 0; // 变量的定义只在它当前的那个大括号有效 所以需要在这里提前定义
        if ( paid >= 30 ) { md = paid - 10;}

        // 判断
        if ( blm > md ){
            System.out.println("50元的情况下,美单更便宜,需要花费" + md + "元");
        }else{
            System.out.println("50元的情况下,饱了么更便宜,需要花费" + blm + "元");
        }



        // 请问2 如果价格不确定,数据由键盘录入而来呢?
        Scanner sc = new Scanner(System.in);
        double paid2 = sc.nextDouble();

        // 计算2个app优惠后的价格
        double blm2 = paid2 * 0.9;
        double md2 = 0; // 变量的定义只在它当前的那个大括号有效 所以需要在这里提前定义
        if ( paid2 >= 30 ) { md2 = paid2 - 10;}

        // 判断
        if ( blm2 > md2 ){
            System.out.println( paid2 + "的情况下,美单更便宜,需要花费" + md2 + "元");
        }else{
            System.out.println( paid2 + "的情况下,饱了么更便宜,需要花费" + blm2 + "元");
        }

    }
}
