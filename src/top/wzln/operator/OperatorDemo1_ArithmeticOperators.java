package top.wzln.operator;

public class OperatorDemo1_ArithmeticOperators {
    static void main(String[] args) {
        /*
            整数运算符:+ _ * / %

            整数计算,小数计算
         */

        // 1. 整数计算
        // 细节:整数相除结果还是整数,只留商
        //      其他计算跟数学中是一模一样的
        int a = 10;
        int b = 3;
        System.out.println(a+b); //13
        System.out.println(a-b); //7
        System.out.println(a*b); //30
        System.out.println(a/b); //3
        System.out.println(a%b); //1
        System.out.println("_________________________________");

        // 2. 小数计算
        // 细节:
        //      计算机中小数直接参与计算,结果有可能不精确,一定要进行精确计算
        double c = 10.0;
        double d = 3.0;
        System.out.println(c+d); // 13.0
        System.out.println(c-d); // 7.0
        System.out.println(c*d); // 30.0
        System.out.println(c/d); // 3.33333333333335
        System.out.println(c%d); // 1.0
    }
}
