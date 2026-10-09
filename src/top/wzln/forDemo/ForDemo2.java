package top.wzln.forDemo;
/*
    for循环算法题(难度递增) 第一题
    需求:在实际开发中,如果要获取一个范围中的每一个数据时 就会用到循环.
    要求1: 打印 1-5
    要求2: 打印 5-1

 */
public class ForDemo2 {
    static void main(String[] args) {
        //打印1-5
        // 开始条件:int i = 1
        // 结束条件:i<=5
        for (int i = 1;i<=5;i++) { //i不能等于0 因为从1开始
            System.out.println(i);
        }

        //打印5-1
        for (int i = 5;i>=1;i--) { //i不能等于0 因为从1开始
            System.out.println(i);
        }
    }

}
