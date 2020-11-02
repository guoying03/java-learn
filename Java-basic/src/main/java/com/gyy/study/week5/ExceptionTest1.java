package com.gyy.study.week5;

import javax.swing.*;

import java.util.Date;
import java.util.Scanner;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;

/**
 * @ClassName ExceptionTest1
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
        //1.ArithmeticException 算术异常
//        int result = 0;
//        try {
//            result = 3 / 0;
//        } catch (ArithmeticException e) {
//            //弹出一个对话框显示：除数不能为0！
//            //JOptionPane.showMessageDialog(null,"除数不能为0！");
//            System.err.println("除数不能为0！" + new Date());
//            System.err.println("除数不能为0！");
//            //e.printStackTrace();
//        }
//        System.out.println(result);
//
//        //2.ArrayIndexOutOfBoundException 数组索引越界异常
//        int[] a = new int[]{1,2,3,4,5};
//        try{
//            System.out.println(a[5]);
//
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("数组索引越界！！");
//            System.err.println("异常的原因：" + e.getCause());
//            System.err.println("异常的详细信息：" + e.getMessage());
//            System.err.println("异常对象e：" + e.toString());
//        }


        //3. NumberFormatException  数字格式化异常
        //3. "123"(字符串123转换成一百二十三)
        System.out.println("请输入价格:");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符串 "123"
        String priceStr = scanner.nextLine();
        //将字符串转成整型  123
        int price = 0;
        try {
            price = Integer.parseInt(priceStr);
        } catch (NumberFormatException e) {
            System.out.println("引起的原因 " + e.getCause());

        }
    }
}
