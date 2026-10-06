package top.wzln.ifdemo;

public class IfDemo1 {
    static void main(String[] args) {
        /*
                定义一个变量表示人的体温,对体温判断是否大于等于38度,如果超过打印语音警告
         */

        // 1.定义一个变量
        double tempature = 39.0;

        // 2.对变量进行判断
        if (tempature >= 38.0){
            System.out.println("您的体温过高!");
        }

    }
}
