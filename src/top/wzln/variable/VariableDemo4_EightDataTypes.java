package top.wzln.variable;

public class VariableDemo4_EightDataTypes {
    static void main(String[] args) {
        /*
            定义8种数据类型的变量:

            整数类型: byte short int long
            浮点数类型: float double
            字符类型: char
            布尔类型: boolean

            变量的定义格式:
                数据类型 变量名 = 数据值;
         */

        // 1.定义byte类型的变量
        byte b =127;
        System.out.println(b);

        // 2.定义short类型的变量
        short s = 32767;
        System.out.println(s);

        // 3.定义int类型的变量
        int i = 200;
        System.out.println(i);

        // 4.定义Long类型的变量
        // 细节:long类型数据必须以L结尾,可以是大写的,也可是小写
        // 建议:一般写成大写的
        long l = 1000000000000000000L;
        System.out.println(l);

        // 5.浮点数类型:float double
        // float变量,必须以f或者F结尾. double不用
        float f = 1.1f;
        System.out.println(f);

        double d = 1.1;
        System.out.println(d);

        // 6.字符类型:char
        char c = '中';
        System.out.println(c);

        // 7.布尔类型boolean
        boolean bb = true;
        System.out.println(bb);
    }
}
