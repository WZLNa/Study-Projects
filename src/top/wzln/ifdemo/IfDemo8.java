package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo8 {
    static void main(String[] args) {
        /*
            需求：很多APP都有不同的优惠券
            假设，现在有以下优惠券：
                全场商品满10减8
                全场商品满50减30
                全场商品满100减50
                全场商品满200减90

                会员卡：全场8折
            请问:会员卡和优惠券不能同时使用，最优惠的价格是多少？
         */

        // 定义变量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品优惠前的价格 -- 算法1");
        double money = sc.nextDouble();
        double discountmoney = 0; // 使用优惠券之后的价格

        // 比较逻辑
        if (money > 0){
            if (money >= 10 & money < 50 ){
                discountmoney = money - 8;
            } else if (money >= 50 & money < 100 ) {
                discountmoney = money - 30;
            } else if (money >= 100 & money < 200 ) {
                discountmoney = money - 100;
            } else if (money >= 200 ) {
                discountmoney = money - 90;
            }
        }else {
            System.out.println("价格不能是负数");
        }

        double memberPrice = money * 0.8; // 定义变量记录会员卡之后的价格

        // 比较优惠券的价格和会员卡的价格
        if (discountmoney < memberPrice){
            System.out.println("优惠券更便宜,需要花费:" + discountmoney + "元");
        }else{
            System.out.println("会员卡更便宜,需要花费:" + memberPrice + "元");
        }

    }
}
