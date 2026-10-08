package top.wzln.switcha;

import java.util.Scanner;

public class SwitchDemo3 {
    static void main(String[] args) {
        /*
            Switch的其他知识点
            2.case穿透
                在我们写代码的时候,如果break没有写,此时就会触发case穿透现象
              执行流程:
                1.拿着小括号中表达式的值和下面的每一个case进行匹配
                2.如果匹配上了,就会执行case里面的语句体,遇到break结束整个的switch(正常情况)
                3.如果在执行语句体的时候没有break,那么程序会继续执行下一个case的语句体,直到遇到break或者运行完整个的switch为止
              应用场景:
                当多个case的语句体重复的时候,利用case穿透节省代码
                case 6:
                case 7:
                    System.out.println("今天是休息日");

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询星期几");
        int week = 5;

        // switch选择阶段
        switch (week){

            case 1:
                System.out.println("星期一");

            default: // 一般建议在最下面
                System.out.println("没有这个星期");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");

        }
    }
}
