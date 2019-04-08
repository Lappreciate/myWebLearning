package com.daojia.Service.Impl;


import com.daojia.User.Person;
import com.daojia.dao.BookDAO;
import com.daojia.pojo.dao_entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

//接口：InitializingBean

@Service
public class student implements Person {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public Integer getNumById(Long id) {

        return 10086;
    }

    @Override
    public void person1() {
        System.out.println("person1");
    }

    @Override
    public void mybatis_test() {
        Book book = new Book();
        book.setTitle("编程思想");
        book.setPublishDate(new Date());
        book.setPrice(100);
        bookDAO.insert(book);
        System.out.println(book.getTitle()+"：已经插入");
    }

    @Override
    public void insert() {
        Book book = new Book();
        book.setTitle("编程思想");
        book.setPublishDate(new Date());
        book.setPrice(100);
        bookDAO.insert(book);
        System.out.println(book.getTitle()+"：已经插入");
    }
}
