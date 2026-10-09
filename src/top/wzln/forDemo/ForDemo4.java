package top.wzln.forDemo;

/*
    for循环算法题(难度递增) 第三题
    需求:在实际开发中,如果要获取一个范围中的每一个数据时 就会用到循环.
        但是,如果只想获取其中符合要求的数据.
        此时就需要循环和其他语句结合使用了.
    比如:求1-100之间的偶数和
 */
public class ForDemo4 {
    static void main(String[] args) {
        // 1.定义一个变量用于求和
        int he = 0;

        // 做法1
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                he = i + he;  //也可以写成 he+=i
            }
        }
        System.out.println("1-100之间的偶数和是:" + he);

        // 做法2
        int he2 = 0;
        for (int i = 2 ; i<=100;i+=2){  // i=1是13579 i=0是0246810
            he2 = i + he2;
        }
        System.out.println("1-100之间的偶数和是:" + he2);
    }
}
