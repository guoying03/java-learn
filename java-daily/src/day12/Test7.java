package day12;

import java.util.Scanner;

/**
 * @ClassName Test7
 * @Description TODO
 * 判断回文字符串，如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，比如mom，dad，noon
 * @Author GYY
 * @Date 2020/10/31
 **/
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        boolean p = isP(next);
        System.out.println("回文数:" + p);
    }
    public static boolean isP(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
