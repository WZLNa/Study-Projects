package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo14 {
    static void main(String[] args) {
        /*
            规则:
                输入变量x,y，判断点所在区域:
                情况1:原点(x=0且y=0)
                情况2:第1象限、第2象限、第3象限、第4象限
                情况3:在y轴上(x=0且y≠0)
                情况4:在x轴上(y=0且x≠0)
         */

        // 输入变量x y
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入变量x:");
        double x = sc.nextDouble();
        System.out.println("请输出变量y:");
        double y = sc.nextDouble();


        //判断逻辑
        //针对这种可能出现重合的情况,判断顺序应是从小到大范围
        if ( x == 0 && y == 0 ){
            System.out.println("原点");
        }else if ( x==0 ){  // 不写&& y!=0的原因是 如果y==0 那么应该直接输出"原点"
            System.out.println("在y轴上");
        }else if ( y==0 ){
            System.out.println("在x轴上");
        }else if ( y>0 && x>0 ){
            System.out.println("第一象限");
        }else if ( y>0 && x<0 ){
            System.out.println("第二象限");
        }else if ( y<0 && x<0 ){
            System.out.println("第三象限");
        }else if ( x>0 && y<0 ){
            System.out.println("第四象限");
        }else {
            System.out.println("不合法");
        }


    }
}
