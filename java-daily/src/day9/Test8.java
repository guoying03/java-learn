package day9;

/**
 * @ClassName Test8
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/28
 **/
public class Test8 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        int i = 10;
        int j = 20;
        j += i / 5;
        int k = j;

        System.out.println("i:" + i + "j:" + j + "k:" + k);
    }
}
