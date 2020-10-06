package com.gyy.study.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int MAX = 5;

    public static void main(String[] args) {
        //创建一个10元素的整型数组
        int[] a = new int[MAX];

        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for (int i = 0; i < MAX; i++) {
            //循环生成100内随机整数赋值给数组，从0（包括0）到100之间（包括100）产生一个随机整数

            a[i] = random.nextInt(100);
            //输出
            System.out.println(a[i] + "");

        }
        int max = a[0];
        int min = a[0];
        int sum = a[0];
        for (int i = 0; i < MAX; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("其中最大值是:" + max);
        for (int i = 0; i < MAX; i++ ) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("其中最小值是:" + min);
        for(int i = 0; i < MAX; i++){
            sum = sum + a[i];
        }
        System.out.println("sum=" + sum );

       for(int i = 0;i < a.length-1; i++) {
           for (int j = 0; j < a.length - 1 - i; j++) {
               if (a[j] > a[j + 1]) {
                   int temp = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = temp;

               }
           }
       }
       System.out.println();
       System.out.println("排序后的数组为：");
       for(int num:a){
           System.out.print(num + " ");
       }
       for(int i = 1; i<a.length; i++){
           int temp = a[i];
           int j = i - 1;
           while(temp < a[j]){
               a[ j + 1] = a[j];
               j--;
               if(j < 0){
                   break;
               }
           }
           a[ j + 1] = temp;
       }
       System.out.println();
       System.out.println("数组为：");
       for(int num:a){
           System.out.print(num + " ");
       }




           }
       }






