package com.gyy.study.week4;

import javax.print.attribute.standard.MediaSize;

/**
 * @ClassName OtherEmployee
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/26
 **/
public abstract class OtherEmployee extends BaseEmployee{
    private String gender;

    public OtherEmployee(String gender){
        this.gender = gender;
    }

    public OtherEmployee(){
    }

}
