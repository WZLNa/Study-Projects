package top.wzln.whileDemo;
/*
    需求:珠穆朗玛峰的高度是8848.86米=8848860毫米,
        假如我有一张足够大的纸,它的厚度是0.1毫米
        请问:该纸张折叠多少次,可以折成珠穆朗玛峰的高度?

    分析:
        1. 纸张折叠:paper * 2
 */
public class whileDemo4 {

    static void main(String[] args) {
        double paper = 0.1;
        int part = 0;

        while (paper<8848860){
            paper = paper * 2;
            part++;
        }
        System.out.println(part);
    }
}
