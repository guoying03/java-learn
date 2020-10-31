package day12;

/**
 * @ClassName Test5
 * @Description TODO
 * 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题
 * @Author GYY
 * @Date 2020/10/31
 **/
public class Test5 {
    public static void main(String[] args) {
        double random = Math.random() * 100;
        System.out.println("随机数为:");
        System.out.println(random);
        String str = random + "";
        int index = str.indexOf(".");
        //System.out.println(index);
        String substring = str.substring(0, index + 3);
        System.out.println("转换为:");
        System.out.println(substring);
    }
}
