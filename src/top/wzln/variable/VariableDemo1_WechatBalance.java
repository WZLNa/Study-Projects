package top.wzln.variable;

public class VariableDemo1_WechatBalance {
    public static void main(String[] args) {
        /*
        微信余额:0元
        支付宝余额:10元
        银行卡余额:20元
        问题一:请问现在一共有多少钱?
        问题二:微信收了10元红包,又发了2元红包,余额多少?
         */

        // 1. 定义一个变量,用来记录微信的余额
        double weixinMoney = 0;

        // 2. 定义一个变量记录支付宝的余额
        double alipayMoney = 10;

        // 3. 定义一个变量记录银行卡的余额
        double cardMoney = 20;

        // 4. 输出现在总共有多少钱?
        System.out.println(weixinMoney + alipayMoney + cardMoney);

        // 5. 微信收了10元红包
        // weixinMoney = 10 的意思是直接修改变量值,此处不能直接修改
        weixinMoney = weixinMoney + 10;
        System.out.println("现在的余额" + weixinMoney);

        // 6. 微信发了2元红包
        weixinMoney = weixinMoney - 2;
        System.out.println("现在的余额" + weixinMoney);

    }
}
