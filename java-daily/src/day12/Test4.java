package day12;

import java.util.Scanner;

/**
 * @ClassName Test4
 * @Description 需求实现（第四个文档）
 * 替换某字符串中的某字符串
 * 键盘录入一个srcStr字符串，在录入一个delStr字符串
 * 删除该字srcStr符串中的所有delStr字符串
 * @Author GYY
 * @Date 2020/10/31
 **/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //1.键盘录入一个源字符串由字符串变量scrStr接收
        System.out.print("请输入源字符串:");
        String srcStr = sc.nextLine();
        //2.键盘录入一个要深处的字符串由字符串变量delStr接收
        System.out.print("请输入要深处的字符串:");
        String delStr = sc.nextLine();

        //3.删除该字scrStr符串中的所有delStr字符串（最终的字符串中不包含delStr），要求打印删除后的结果以及删除了及格delStr字符串
        printCount(srcStr, delStr);
    }

    //删除该字scrStr字符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除最后的结果以及删除了几个delStr字符串
    private  static void printCount(String srcStr, String delStr) {
        //删除后的结果
        String resultStr = srcStr.replace(delStr, "");
        //删除了及格delStr字符串
        int count = (srcStr.length() - resultStr.length()) / delStr.length();

        System.out.println("源字符串中总共包含:" + count + "个" + delStr + " , \r\n删除" + delStr + "后的字符串为：" + resultStr);
    }
}
