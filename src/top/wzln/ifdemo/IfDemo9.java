package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo9 {
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
        System.out.println("请输入商品优惠前的价格 -- 算法2");
        double money = sc.nextDouble();
        double discountmoney = 0; // 使用优惠券 优惠券能给优惠的价格

        // 比较逻辑
        if (money > 0){
            if ( money < 10 ){
                discountmoney = 0 ;
            } else if ( money < 50 ) { // 如果代码能走到这里 那么money一定是大于0且大于10的
                discountmoney = 8;
            } else if ( money < 100 ) {
                discountmoney = 30;
            } else if ( money < 200 ) {
                discountmoney = 50;
            } else {
                discountmoney = 90;
            }
        }else {
            System.out.println("价格不能是负数");
        }

        double memberPrice =  money - (money * 0.8); // 定义变量记录会员卡能优惠的价格

        // 比较优惠券的价格和会员卡的价格
        if (discountmoney < memberPrice){
            System.out.println("会员卡更便宜,需要花费:" + ( money - memberPrice ) + "元");
        }else{
            System.out.println("优惠券更便宜,需要花费:" + ( money - discountmoney ) + "元");
        }
    }
}
