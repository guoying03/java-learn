package com.gyy.study.week4;

/**
 * @ClassName BaseEmployee
 * @Description 基础的员工抽象类
 * @Author GYY
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract calss.");
    }

    /**
     *发工资
     *
     * @return int
     */
    public abstract int getSalary();
}
