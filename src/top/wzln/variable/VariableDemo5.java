package top.wzln.variable;

public class VariableDemo5 {
    static void main(String[] args) {

        // BMI = 体重 / 身高的平方

        // 1.定义变量记录我的体重 53.5KG
        double weight = 53.5;

        // 2.定义变量记录我的身高
        double height = 1.73;

        // 3.计算BMI
        double bmi = weight / (height * height);
        System.out.println("当前BMI:" + bmi);

        // 扩展: 计算出你当前的身高,在标准BMI下,体重最高是多少
        double bmi2 = 18.5;
        double maxweight = bmi2 * (height * height);
        System.out.println("当前的身高,在标准BMI下,体重最高是" + maxweight + "KG");
    }
}