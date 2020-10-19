package com.gyy.study.week3.afterclasstest;

/**
 * @ClassName Point
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class Point {
    private Integer x;
    private Integer y;

    public double getDistance(Point p){
        double r = Math.sqrt(p.x - x) * (p.x - x) + (p.y - y) * (p.y - y);
        return r;
    }
    public Point (int x,int y){
        this.x = x;
        this.y = y;
    }
}
