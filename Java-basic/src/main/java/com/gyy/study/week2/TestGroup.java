package com.gyy.study.week2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author GYY
 * @Date 2020/10/12
 **/

public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("Java基础",99,new Date());
        Book book2 = new Book("JavaScript",100,new Date());
        Book book3 = new Book("Java宝典",150,new Date());
        Book book4 = new Book("Java速成",60,new Date());
        Book book5 = new Book("Java语言",70,new Date());

        Phone phone1 = new Phone("iPhoneXS",8888);
        Phone phone2 = new Phone("iPhone8",7777);
        Phone phone3 = new Phone("iPhone7S",6668);

        Student student1 = new Student("1001","张三","男",phone1,new Book[]{book1,book2});
        Student student2 = new Student("1002","张丽","女",phone2,new Book[]{book1,book2,book3,book4});
        Student student3 = new Student("1003","hero","男",phone1,new Book[]{book5});

        Group group1 = new Group("第一组",new Student[]{student1,student2});
        Group group2 = new Group("第二组",new Student[]{student3});

        Student[] students = group1.getStudents();
        for(Student student : students)
        {
            System.out.println(student.getStudentName());
        }



    }
}
