package top.wzln.forDemo;
/*
    for循环算法题(难度递增) 第二题
    需求:在实际开发中,如果要获取一个范围中的每一个数据时 就会用到循环.
    要求:求1-5之间的和
 */
public class ForDemo3 {
    static void main(String[] args) {

        int he = 0; //定义he变量存放1-5之间的和

        for(int i = 1 ; i<=5 ; i++){
            System.out.println(i);
            he += i ; // 等价于he = i + he;
        }
        System.out.println("1-5之间的和为:" + he);

    }
}
