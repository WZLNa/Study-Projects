package top.wzln.weekend_homework.Week1;

import java.util.Scanner;

/*
    请自定义函数实现十进制与二进制，与八进制，与十六进制的互转。

    参考:https://blog.csdn.net/szwangdf/article/details/2601941
        https://codegym.cc/zh/groups/posts/zh.870.java-jiang-er-jin-zhi-zhuan-huan-wei-shi-jin-zhi

    知识点:自定义函数,Integer.toOctalString,Integer.parseInt的使用
 */
public class Week1Jinzhi_convert {
    static void main(String[] args) {
        // 输入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制整数");
        int inputdec = sc.nextInt();

        System.out.println("这个数转为二进制为:" + decToBin(inputdec));
        System.out.println("这个数转为八进制为:" + decToOct(inputdec));
        System.out.println("这个数转为十六进制为:" + decToHex(inputdec));
        System.out.println("---------------------十进制转换部分完成------------------------");

        System.out.println("现在请输入一个二进制数,程序将将其转换为十进制数:");
        String inputbin = sc.next();
        System.out.println("这个二进制数转换为十进制为:" + binToDec(inputbin));

        System.out.println("现在请输入一个八进制数,程序将将其转换十进制数:");
        String inputoct = sc.next();
        System.out.println("这个八进制数转换为十进制为:" + octToDec(inputoct));

        System.out.println("现在请输入一个十六进制数,程序将将其转换为十进制数:");
        String inputhex = sc.next();
        System.out.println("这个八进制数转换为十进制为:" + hexToDec(inputhex));

    }


    // 十进制转二进制
    public static String decToBin(int dec){  //返回一个字符串 方法名为decToBin 接收一个int类型的变量将其命名为dec在下面使用
        return Integer.toBinaryString(dec);  //dec已定义 不需要重新定义
    }

    // 十进制转八进制
    public static String decToOct(int dec){
        return Integer.toOctalString(dec);
    }

    // 十进制转十六进制
    public static String decToHex(int dec){
        return Integer.toHexString(dec);
    }

    // 二进制转十进制
    public static int binToDec(String bin){  //Integer.parseInt方法返回的是一个int,所以要写public static int
        return Integer.parseInt(bin,2);  //Integer.parseInt接收的是一个String,所以输入要是String
    }

    // 八进制转十进制
    public static int octToDec(String oct){
        return Integer.parseInt(oct,8);
    }

    // 十六进制转十进制
    public static int hexToDec(String hex){
        return Integer.parseInt(hex,16);
    }


}
