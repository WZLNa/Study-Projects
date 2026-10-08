package top.wzln.ifdemo;

import java.util.Scanner;

public class IfDemo10 {
    static void main(String[] args) {
    /*
        现有一公园,会员卡充值规则如下:
        充值 1000 元 赠送金额 200 元
        充值 2000 元 赠送金额 500 元
        充值 3000 元 赠送金额 700 元
        充值 5000 元 赠送金额 1300 元
        充值 10000 元 赠送金额 2500 元
        充值 20000 元 赠送金额 6000 元
        充值 50000 元 赠送金额 15000 元

        请计算充值不同的额度,卡里余额是多少?

     */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要充值的金额:");
        double paid = sc.nextDouble();
        double present = 0 ;
        double balance = 0 ;

        if ( paid > 0 ){
            if (paid < 1000 ){
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 2000 ){ // 小于1000不会执行到这里 则为 1000. - x - .2000
                present = 200 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 3000 ){
                present = 500 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 5000 ){
                present = 700 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 10000 ){
                present = 1300 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 20000 ){
                present = 2500 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else if ( paid < 50000 ){
                present = 6000 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            } else { // 小于50000也不达成 则为大于等于50000，赠送15000
                present = 15000 ;
                balance = paid + present ;
                System.out.println( "充值成功 赠送金额" + present + "现在余额" + balance );
            }
        } else {
            System.out.println("请输入正确的金额!");
        }

    }
}
