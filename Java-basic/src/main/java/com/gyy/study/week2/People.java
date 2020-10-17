package com.gyy.study.week2;

/**
 * @ClassName People
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/17
 **/
public class People {
    int leg,hand;
    String name;
    People(String s){
        name = s;
        this.init();
    }
    void init(){
        leg = 2;
        hand = 2;
        System.out.println(name + "有" + hand + "只手" + leg + "条腿");
    }

    public static void main(String[] args) {
        People boshi = new People("布什");
    }
}
