package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo11 {
    static void main(String[] args) {
        /*
            bmi计算器（融合if版）
         */

        // 1.定义一个变量
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的身高(单位:m):");
        double height = sc.nextDouble(); // 身高
        System.out.println("请输入您的体重(单位:kg):");
        double weight = sc.nextDouble(); // 体重

        // 2.计算
        double bmi = weight / (height * height);

        // 3.输出
        if ( bmi >= 0){
            if ( bmi < 18.5 ){
                System.out.println("您的bmi为" + bmi + "评估结果:消瘦 健康风险:部分增加");
            } else if ( bmi <= 23.9 ) {
                System.out.println("您的bmi为" + bmi + "评估结果:正常 健康风险:正常");
            } else if ( bmi <= 26.9 ) {
                System.out.println("您的bmi为" + bmi + "评估结果:偏胖 健康风险:增加");
            } else if ( bmi <= 29.9 ) {
                System.out.println("您的bmi为" + bmi + "评估结果:肥胖 健康风险:中度增加");
            } else {
                System.out.println("您的bmi为" + bmi + "评估结果:严重肥胖 健康风险:严重增加");
            }
        }else {
            System.out.println("输入可能有误!");
        }
    }
}
