package top.wzln.weekend_homework.Week1;
/*
    现在有10个正整形数且没有顺序，请快速的找出最大数，编程实现。

    知识点:for循环 数组
 */
public class Week1MaxNumber {
    static void main(String[] args) {
        // 定义一个int类型的数组
        int[] numberList = {2,4,3,1,6,5,7,8,9,0};
        int max = numberList[0]; //定义max变量用来存放擂主，默认为numberList[0]
        for (int i = 1;i< numberList.length;i++){
            // i从1开始是因为numberList[0]已经赋值给max，直接比较即可
            if (numberList[i] > max){
                max = numberList[i];
            }
        }
        System.out.println(max);

    }
}
