package day9;

/**
 * @ClassName Test7
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/28
 **/
public class Test7 {
    public static void main(String[] args) {
        //在main方法中调用printNmu方法
        printNum();
    }

    public static void printNum() {
        //定义float变量f1赋值12345.01，定义float变量f2赋值12345.00
        float f1 = 12345.01F;
        float f2 = 12345.00F;
        //定义float变量var1，使用三元运算赋值，当f1大于等于f2时，赋值12456，当f1小于f2赋值12456.02
        float var1 = (f1 >= f2) ? 12456 : 12456.02F;
        //定义float 变量 var2 ， 保存var1 与 1024的和.
        float var2 = var1 + 1024;
        //输出var1，var2的值.
        System.out.println("var1的值为：" + var1 + "var2的值为：" + var2);
    }
}
