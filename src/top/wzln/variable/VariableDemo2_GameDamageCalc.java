package top.wzln.variable;

public class VariableDemo2_GameDamageCalc {
    static void main(String[] args) {
        /*
            我方:叉子       对方:长手
            攻击:220       攻击:210
            防御:85        防御:80
            血量:1012.5    血量:1223.3
            技能加成: 1.2   技能加成：1.3

            技能造成伤害的公式: 攻击力 * 技能加成 - 对方防御力
            普攻造成伤害的公式: 攻击力 - 对方防御力

            计算:
                我方第一次进行普通攻击,造成多少伤害,对方还剩余多少血量?
                我方第二次进行技能攻击,造成多少伤害,对方还剩余多少血量?

            规则:经常发生改变的数据,用变量记录
         */

        // 1.定义变量记录我方的攻击力
        int myAttack = 220;
        // 2.定义变量记录我方的防御力
        int myDefense = 85;
        // 3.定义变量记录我方的血量
        double myhealth = 1012.5;
        // 4.定义变量记录我方的技能加成
        double myskillAdd = 1.2;
        // 5.定义变量记录对方的攻击力
        int dfAttack = 210;
        // 6.定义变量记录对方的防御力
        int dfDefense = 80;
        // 7.定义变量记录对方的血量
        double dfhealth = 1223.3;
        // 8.定义变量记录对方的技能加成
        double dfskillAdd = 1.3;

        // 计算我方第一次进行普通攻击,造成多少伤害,对方还剩余多少血量?
        // 普攻造成伤害的公式: 攻击力 - 对方防御力
        double damage1 = myAttack - dfDefense;
        dfhealth = dfhealth - damage1;
        System.out.println("对方还有" + dfhealth);

        // 计算我方第二次进行技能攻击,造成多少伤害,对方还剩余多少血量?
        // 技能造成伤害的公式: 攻击力 * 技能加成 - 对方防御力
        double damage2 = myAttack * myskillAdd - dfDefense;
        dfhealth = dfhealth - damage2;
        System.out.println("对方还有" + dfhealth);
    }
}
