package com.gyy.study.week2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import jdk.jfr.DataAmount;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;
import java.util.Date;

/**
 * @ClassName Book
 * @Description 书类
 * @Author GYY
 * @Date 2020/10/12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String name;
    private Integer price;
    private Date publishDate;

    public Book(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Book book = new Book("Java", 122, new Date());
        Book book1 = new Book("高数");
        System.out.println(book);
    }

}
