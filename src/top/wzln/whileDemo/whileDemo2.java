package top.wzln.whileDemo;

/*
    for和while的对比
 */
public class whileDemo2 {
    static void main() {

        //for循环10次跳跃  --明确了循环的次数 --范围1-10
        for ( int i =1 ;i<=10;i++){
            System.out.println("for跳跃1次");
        }

        //while10次跳跃
        int a = 1;
        while (a<=10){
            System.out.println("while跳跃一次");
            a++;
        }

    }
}
