package com.gyy.study.week2;

/**
 * @ClassName Student1
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/18
 **/
public class Student1 {
    private int age;
    public void setAge(int age){
        if(age >= 7&&age <= 28){
            this.age = age;

        }
    }
    public int getAge(){
        return age;
    }
}
