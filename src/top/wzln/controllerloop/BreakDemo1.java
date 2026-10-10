package top.wzln.controllerloop;
/*
    break关键字:
        不能单独出现的,只能写在switch或者循环当中,表示结束 跳出的意思
 */
public class BreakDemo1 {
    static void main(String[] args) {

        int i = 1;
        while(true){
            i++;
            if (i==100){
                System.out.println(i);
                break;
            }
        }
    }
}
