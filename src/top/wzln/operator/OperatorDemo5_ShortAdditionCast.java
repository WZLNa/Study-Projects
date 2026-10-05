package top.wzln.operator;

public class OperatorDemo5_ShortAdditionCast {
    static void main(String[] args) {
        /*
            练习二:
            检查下面代码，程序运行的时候是否会报错,如果会,请说明报错原因
            byte result2 = s1 + s2; //会 因为s1+s2计算完是int类型,又没有强制转换为byte
            System.out.println(result2);
         */
        short s1 = 100;
        short s2 = 200;

        // 修改方案1:进行强制转换(结果可能出现问题)
        byte result2 = (byte)(s1 + s2);
        System.out.println(result2); //44

        // 修改方案2:修改result2的类型
        int result3 =(s1 + s2);
        System.out.println(result3); //300

    }
}
