package top.wzln.switcha;

import java.util.Scanner;

public class SwitchDemo1 {
    static void main(String[] args) {
        /*
            Switch语句练习1--减肥计划
            需求:键盘录入一个数,显示当天的减肥活动
            switch的注意点:
                1.表达式:结果(字符/整数byte shortint/枚举/字符串) ---(索引)不支持小数，也不支持大的整数(long)
                2.case:被匹配的值，只能是真实的数据
                3.case值不允许重复
                4.break:表示中断，结束的意思，结束switch语句
                5.default:所有情况都不匹配，执行该处的内容

            break 的作用是阻止"case 穿透"(fall-through)。Switch 匹配到某个 case 后，会从这个 case 开始一直往下执行所有语句，直到遇到 break 或者整个 switch 结束才停。
         */

        // 1.定义变量记录星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询星期几的减肥计划");
        int week = sc.nextInt();

        // switch选择阶段
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("慢走");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default: // 也可以不写 但是建议写上
                System.out.println("请输入正确的数字!");
                break;
        }
    }
}
