package com.gyy.study.week3.afterclasstest;

import com.gyy.study.week3.Circle;

/**
 * @ClassName CircleTest
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class CircleTest {
    public static void main(String[] args) {
        //创建一个点对象
        Points p = new Points(3,4);
        //创建一个圆对象
        Circles c = new Circles(2);
        int ret = c.judge(p);
        //调用circle类中的判断
        System.out.println(ret);
    }
}
