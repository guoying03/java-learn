package com.gyy.study.week4;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @ClassName MarketEmployee
 * @Description 市场部员工工资
 * @Author GYY
 * @Date 2020/10/26
 **/
public  class MarketEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGHER_SALARY = 3000;
    private static final int LOWER_SALARY = 1000;

    public MarketEmployee(String id) {
        this.id = id;
    }

    public MarketEmployee() {
    }

    @Override
    public void print() {
        super.print();
        System.out.println("This is a MarketEmployee class");
    }

    @Override
    public int getSalary() {
        if ("admin".equals(this.id)) {
            return HIGHER_SALARY;
        } else {
            return LOWER_SALARY;
        }
    }
}

