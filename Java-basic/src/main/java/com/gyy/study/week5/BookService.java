package com.gyy.study.week5;



/**
 * @ClassName BookService
 * @Description TODO
 * @Author GYY
 * @Date 2020/11/2
 **/

public interface BookService {
    boolean putOnSale(Book book) throws ISBNException, BookNameException, PriceException;
}
