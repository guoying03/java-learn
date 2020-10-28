package day9;

/**
 * @ClassName Test9
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/28
 **/
public class Test9 {
    public static void main(String[] args) {
        printString();
    }

    public static void printString(){
        String str ;
        int num = 69;
        str = (num % 2 == 0) ? "偶数": "奇数";
        System.out.println("num:" + num + "是" + str);
    }
}
