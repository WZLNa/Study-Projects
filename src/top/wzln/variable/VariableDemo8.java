package top.wzln.variable;

import java.util.Scanner;

public class VariableDemo8 {
    static void main(String[] args) {
        // BMI计算器(支持输入版)
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用BMI计算器,请先输入你的身高(单位:m)");
        double height = sc.nextDouble();
        System.out.println("现在请输入你的体重(单位:Kg)");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("您的BMI是:" + bmi);
    }
}
