package top.wzln.weekend_homework.Week1;

import java.util.Scanner;

/*
    请设计一个"判断学生成绩等级"的小案例
    要求说明：等级划分规则、用到的知识点、程序的大致流程。

    等级划分规则：[0--20) 拉完了
                [20--40) 还行
                [40--60) 人上人
                [60--80) 顶级
                [80--100] 夯
    用到的知识点：if if嵌套 Scanner的使用 变量
    大致流程：
    用Scanner监听控制台输入，赋值给num变量
    num变量使用if进行比较
 */
public class Week1StudentRange {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩，程序将判断成绩所处的等级：");
        double num = sc.nextDouble();

        if ( num > 0 ){
            if (num<20){
                System.out.println("您的成绩等级为 拉完了");
            } else if(num<40){
                System.out.println("您的成绩等级为 还行");
            } else if (num<60) {
                System.out.println("您的成绩等级为 人上人");
            } else if (num<80) {
                System.out.println("您的成绩等级为 顶级");
            } else {  //小于80也没达成，那肯定是大于80
                System.out.println("您的成绩等级为 夯");
            }
        }else {
            System.out.println("成绩不合法！");
        }
    }
}
