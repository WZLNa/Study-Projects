package top.wzln.switcha;

public class SwitchDemo5 {
    static void main(String[] args) {
        /*
            Switch的其他知识点
            3.switch新特性(JDK14实装):
                一.箭头标签
                    case 1 -> {
                        System.out.println("跑步");
                        System.out.println("跑5公里");
                        System.out.println("拉伸放松");
                    }

                    -> 和: 不能混用在一个switch里面

                二.case后面可以写多个值
                    case 5,6,7,8,9 :
                        System.out.println("11111");
                        System.out.println("22222");

                三.switch可以有运行结果
                四.yield关键字
         */

        int number = 2;
        switch (number){
            case 1 ->{
                System.out.println("1");
                System.out.println("2");
            }
            case 2 ->{
                System.out.println("11");
                System.out.println("22");
            }
            case 3 -> System.out.println("111");
            case 4 -> System.out.println("1111");
            case 5,6,7,8,9 ->{
                System.out.println("11111");
                System.out.println("22222");
            }
        }

    }
}
