package com.gyy.study.week3;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class Cylinder extends Circle {
    private int h;

    public Cylinder(int x, int y, int r, int h) {
        super(x, y, r);
        this.h = h;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("圆柱体的体积：" + super.gerArea() * this.h);
    }
    // @Override
    // public String toString(){
    //return super.toString();
    //}
}


