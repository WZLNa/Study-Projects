package top.wzln.infiniteloop;
/*
    几个死循环
        在无限循环的下面,不能有任何代码(不可到达)
 */
public class InfiniteLoopDemo {
    static void main(String[] args) {
        // dowhile方法
        do{
            System.out.println("Hellodowhile");
        }while(true);

//        //for方法
//        for(;;){
//            System.out.println("Hellofor");
//        }
//
//        // while方法
//        while(true){
//            System.out.println("Hellowhile");
    }
}
