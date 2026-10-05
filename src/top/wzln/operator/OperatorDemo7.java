package top.wzln.operator;

public class OperatorDemo7 {
    static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a); // 11

        /*
            =   直接赋值    a=0
            +=  加后赋值    a+=b    a+b=a
            -=  减后赋值    a-=b    a-b=a
            *=  乘后赋值    a*=b    a*b=a
            /=  除后赋值    a/=b    a/b=a
            %=  取模后赋值   a%=b    a%b=a
         */

        int aa = 10;
        int bb = 20;

        // aa + bb ---> aa
        aa += bb ;
        System.out.println(aa);
        System.out.println(bb);

    }
}
