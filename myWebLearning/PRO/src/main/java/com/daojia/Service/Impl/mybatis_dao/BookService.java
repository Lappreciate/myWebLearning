package com.daojia.Service.Impl.mybatis_dao;

import com.daojia.DataSourceType;
import com.daojia.dao.BookDAO;
import com.daojia.dao.UserDAO;
import com.daojia.pojo.dao_entity.Book;
import com.daojia.pojo.dao_entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private UserDAO userDAO;

    @DataSourceType(value = "mybatis_test")
    public void insertBook(){
        Book book = new Book();
        book.setTitle("数学之美");
        book.setPublishDate(new Date());
        book.setPrice(150);
        bookDAO.insert(book);
        System.out.println(book.getTitle()+"：已经插入");
    }

    @DataSourceType(value = "mybatis_test1")
    public void insertUser(){
        User user = new User();
        user.setUsername("刘晟源");
        user.setSex("man");
        user.setAge(120);
        userDAO.insertUser(user);
        System.out.println(user.getUsername()+"：已经插入");
    }
}
