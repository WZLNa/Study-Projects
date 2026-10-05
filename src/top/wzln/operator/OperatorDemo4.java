package top.wzln.operator;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class OperatorDemo4 {
    static void main(String[] args) {

        // 练习一：
        byte b = 100;
        short s = 200;
        double d = 20.3;

        // 请说出下面代码在计算的时候，类型转换的情况
        double results1 = b + s + d;
        System.out.println(results1);

        /*
            1. b + s
            先把byte类型的100,和short类型的200提升为int类型
            结果300(int)

            2. 300(int) + d
            int类型的300会提升为double类型,变成300.0
            结果:320.3(double)
         */

    }
}
