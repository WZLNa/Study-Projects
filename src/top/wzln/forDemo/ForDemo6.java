package top.wzln.forDemo;

public class ForDemo6 {
    static void main(String[] args) {
        /*
                for循环算法题(难度递增) 第五题
                需求:有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第10项的数字是多少？
                    0,1,1,2,3,5,8
         */

        int a = 0 ; //a+b=c b+c=d c+d=f
        int b = 1;

        int c = 0; // a和b后面的值

        // 循环开始条件: 3 (从第三项开始计算)
        // 循环结束条件: 10
        // 循环体: 求c的值 不断修改a和b记录的值
        for (int i = 3;i<=10;i++){
            // 求c的值(求前一组最后一个值)
            c = a+b;
            // 求下一组的a和b的值
            a = b;
            b = c;
            System.out.println(c);
        }

        System.out.println("是" + c );
    }
}
