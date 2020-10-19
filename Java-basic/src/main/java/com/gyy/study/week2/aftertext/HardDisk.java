package com.gyy.study.week2.aftertext;

/**
 * @ClassName HardDisk
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/19
 **/
public class HardDisk {
    private int amount;

    void setAmount(int amount){
        if (amount>0){
            this.amount = amount;
        }
    }

    int getAmount(){
        return amount;
    }
}
