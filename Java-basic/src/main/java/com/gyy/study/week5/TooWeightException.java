package com.gyy.study.week5;

/**
 * @ClassName TooWeightException
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/2
 **/
public class TooWeightException extends Exception{
    private String msg;

    public TooWeightException(){
        super();
    }

    public TooWeightException(String msg){
        super();
        this.msg = msg;
    }

    public boolean showMsg() {
        return false;
    }
}
