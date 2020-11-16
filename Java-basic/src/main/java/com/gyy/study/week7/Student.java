package com.gyy.study.week7;

import com.gyy.study.week2.Example4_6;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/16
 **/
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o ){
        if (this.getAge() > o.getAge()){
            return -1;
        }else if (this.getAge() < o.getAge()){
            return 1;
        }
        else{
            return 0;
        }
    }


}
