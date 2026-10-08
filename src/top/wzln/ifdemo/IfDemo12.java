package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo12 {
    static void main(String[] args) {
        /*
        用电量计算采取阶梯计费原则，规则如下:

            1.[0~100]度，按0.5元/度计费
            2.(100~200]度，按0.8元/度计费
            3.(超过200]度，按1.2元/度计费
            输入变量usage表示实际用电量，
            输出总电费cost。
            示例输入:usage=150
            示例输出:cost=100*0.5+50*0.8=90

         */

        // 输入变量usage表示实际用电量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的实际用电量:");
        double allusage = sc.nextDouble();
        double cost1 = 0 ;
        double cost2 = 0 ;
        double cost3 = 0 ;

        // 计算
        if ( allusage >= 0 ){

            if ( allusage <= 100 ){
                cost1 = allusage * 0.5 ;

                System.out.println( "您的总花费为: " + allusage +" * 0.5 = " + cost1);
            } else if ( allusage <= 200 ) {
                cost1 = 100 * 0.5 ;
                cost2 = ( allusage - 100 ) * 0.8 ;

                System.out.println( "您的总花费为: " + "100 * 0.5 + " + (allusage-100) + " * 0.8 = " + (cost1 + cost2) );
            } else {
                cost1 = 100 * 0.5 ;
                cost2 = 100 * 0.8 ; // cost1和cost2相差为100,这里需要是100*0.8
                cost3 = ( allusage - 200 ) * 1.2 ;

                System.out.println("您的总花费为: " + "100 * 0.5 + 100 * 0.8 + " + ( allusage - 200 ) + " * 1.2 = " + (cost1+cost2+cost3) );
            }

        } else {
            System.out.println("实际用电量输入有误");
        }

    }
}
