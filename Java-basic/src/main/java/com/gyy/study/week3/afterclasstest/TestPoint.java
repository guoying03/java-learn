package com.gyy.study.week3.afterclasstest;


/**
 * @ClassName TestPoint
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(12,22);
        Point point2 = new Point(33,15);
        double x = point1.getDistance(point2);
        System.out.println("两点之间的距离为" + x);
    }
}
