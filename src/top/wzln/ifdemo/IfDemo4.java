package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo4 {
    static void main(String[] args) {
        /*
            需求:定义一个小数表示考试成绩
            判断学生的考试成绩,如果大于等于60分输出通过,否则不通过
         */

        // 1.定义一个小数表示成绩
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();

        // 2.判断
        if (score >= 60 & score <= 100 & score >= 0){
            System.out.println("通过");
        } else {
            System.out.println("不通过");
        }

        // 2.第二种方法(if的嵌套)
        if (score <= 100 & score >=0){
            if (score >= 60){
                System.out.println("通过");
            } else {
                System.out.println("不通过");
            }
        }else{
            System.out.println("成绩不合法");
        }

    }
}
