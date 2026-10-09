package top.wzln.weekend_homework.Week1;

import java.util.Scanner;

/*
    题目需求：
        有一家卖麻辣烫的小饭馆，菜品的单价是1元,2元,3元，5元,10元这样五种价格，顾客可以根据自己的喜好去选择食材，
        麻辣烫老板也经常搞活动，如满20元打9.8折，满50元打9折，满100元打8.5折。现在请你帮他写一个小的应用程序能
        够帮助老板快速的算账，要求操作尽可能的便捷。
 */
public class Week1Shop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------欢迎使用麻辣烫饭馆自助算账系统-----------------");
        System.out.println("系统存在的菜品有：1元,2元,3元，5元,10元");
        System.out.println("请输入您要购买的 1元 商品的数量:");
        double num1 = sc.nextDouble();
        System.out.println("请输入您要购买的 2元 商品的数量:");
        double num2 = sc.nextDouble();
        System.out.println("请输入您要购买的 3元 商品的数量:");
        double num3 = sc.nextDouble();
        System.out.println("请输入您要购买的 5元 商品的数量:");
        double num4 = sc.nextDouble();
        System.out.println("请输入您要购买的 10元 商品的数量:");
        double num5 = sc.nextDouble();

        double num1_usage = num1 * 1;
        double num2_usage = num2 * 2;
        double num3_usage = num3 * 3;
        double num4_usage = num4 * 5;
        double num5_usage = num5 * 10;
        double all_usage = num1_usage + num2_usage + num3_usage + num4_usage + num5_usage;
        double last_usage = 0; // 记录最终价格

        System.out.println("您购买的商品总价为：" + all_usage);
        System.out.println("本店满20元打9.8折，满50元打9折，满100元打8.5折");

        if ( all_usage >=0 ){
            if ( all_usage < 50 ){  //小于50，[0,50)
                last_usage = all_usage * 0.98;
            } else if ( all_usage < 100 ) {
                last_usage = all_usage * 0.9;
            } else {
                last_usage = all_usage * 0.85;
            }
        }else{
            System.out.println("不合法！");
        }

        System.out.println("你的应付金额为：" + last_usage);

    }
}
