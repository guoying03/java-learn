package com.gyy.study.week4;

/**
 * @ClassName Person
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/26
 **/
public  class Person implements Fly,Travel{
    @Override
    public int speed()
    {
        return 1000;
    }
    @Override
    public void go(String destination){
        System.out.println("go to" + destination);
    }


}
