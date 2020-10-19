package com.gyy.study.week2.aftertext;

/**
 * @ClassName Pc
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class Pc {
    Cpu cpu;
    HardDisk HD;

    public void setCpu(Cpu cpu){
        this.cpu=cpu;
    }
    public void setHardDisk(HardDisk HD)
    {
        this.HD=HD;
    }

    public void show(){
        System.out.println("cpu的速度"+cpu.getSpeed()+"硬盘的速度"+ HD.getAmount());
    }
}
