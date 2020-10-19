package com.gyy.study.week2.aftertext;

/**
 * @ClassName Cpu
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class Cpu {
    private int speed;

    void setSpeed(int speed)
    {
        if(speed>0){
            this.speed = speed;
        }
    }

    int getSpeed(){
        return speed;
    }
}
