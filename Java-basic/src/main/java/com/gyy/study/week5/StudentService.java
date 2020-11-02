package com.gyy.study.week5;

/**
 * @ClassName StudentService
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/2
 **/
public interface StudentService {
    boolean checkHealth(Student student) throws TooWeightException;
}
