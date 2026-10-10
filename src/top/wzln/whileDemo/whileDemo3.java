package top.wzln.whileDemo;
/*
    假设你在银行投资了100000元,银行给出的复利是1.7%,问多少年后本金翻倍?
    请问:用什么循环,代码如何实现

    单利:利息不计入本金
    复利:前一年利息计入本金,下一年继续算利息
 */
public class whileDemo3 {
    static void main(String[] args) {
        double paid = 100000;
        double a = 0; //定义变量存放利息
        int b = 0; //定义变量存放过去的年份

        while(paid< 200000){
            a = paid * 0.017; //计算利息,计算一次视为过去一年
            b++; // 年+1
            paid = a + paid; //计算完毕把利息加到本金
        }
        System.out.println(b);


    }
}
