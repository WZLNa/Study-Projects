package top.wzln.switchDemo;

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

        // case后面可以写多个值
        // 箭头标签
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


        int number2 = 3;
        //switch可以有运行结果
        //yield关键字 : 将返回值传给switch2变量
        // switch 表达式：有运行结果，且结果被赋值给了变量 → 必须穷尽（跟用不用 yield 无关）或写default
        // switch 语句：只是执行一些操作（比如打印），不产生值 → 不需要穷尽
        String switch2 = switch (number2){
            case 1 ->{
                yield "一";
            }
            case 2 ->{
                yield "二";
            }
            case 3 ->{
                yield "三";
            }
            case 4 ->{
                yield "四";
            }
            case 5,6,7,8,9 ->{
                yield "五六七";
            }
            default -> {
                yield "不涵盖";
            }
        };
        // 直接使用switch2的结果
        System.out.println(switch2);

    }
}
