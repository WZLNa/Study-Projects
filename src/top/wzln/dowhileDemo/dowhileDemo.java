package top.wzln.dowhileDemo;
/*
    利用do...while循环,输出5行helloworld

    在do...while循环,熟悉语法即可,无需额外练习

    特点:先执行 后判断 循环体至少执行一次
    for while的特点:先判断 后执行
 */
public class dowhileDemo {
    static void main(String[] args) {


        // dowhile方法
        int i = 0;
        do{
            System.out.println("Hellodowhile");
            i++;
        }while(i<5);

        //for方法
        for( int j =0;j<5;j++){
            System.out.println("Hellofor");
        }

        // while方法
        int k = 0;
        while(k<5){
            System.out.println("Hellowhile");
            k++;
        }

    }
}
