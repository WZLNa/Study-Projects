package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    static void main(String[] args) {
        /*
            需求:初始最大生命200,收到x点伤害,技能回复y点血,x和y由键盘录入而来
            假设,游戏人物不会死亡,最少1点血
            问:最终游戏人物血量是多少?
         */

        // 1.定义一个变量记录游戏人物的生命值
        int hp = 200;

        // 2.受到了x点伤害
        System.out.println("请输入当前人物受到的伤害");
        Scanner sc = new Scanner(System.in);
        int hurt = sc.nextInt();

        if ( hurt >=0 ){
            hp = hp - hurt; // 3.计算当前的血量

            if (hp <= 0){
                hp = 1; // 游戏人物不会死亡,最少1点血
            }

            System.out.println("当前游戏人物的血量是" + hp);
        } else {
            System.out.println("请输入一个正数!"); //TODO:这里需要让用户重新输入,而不是直接进入技能回复(需要循环体)
        }


        // 4.键盘输入一个值,代表技能回复的血量
        System.out.println("请输入技能回复的血量:");
        int add = sc.nextInt();

        if (add > 0){

            hp = hp + add; // 5.计算当前游戏人物的血量
            if (hp > 200){
                hp = 200;
            }

            System.out.println("当前游戏人物的血量是" + hp);
        } else {
            System.out.println("请输入一个正数!"); //TODO:这里需要让用户重新输入,而不是直接结束(需要循环体)
        }

    }
}
