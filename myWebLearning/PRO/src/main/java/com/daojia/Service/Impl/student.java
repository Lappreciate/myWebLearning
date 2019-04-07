package com.daojia.Service.Impl;


import com.daojia.User.Person;
import org.springframework.stereotype.Service;

//接口：InitializingBean

@Service
public class student implements Person {

    @Override
    public Integer getNumById(Long id) {

        return 10086;
    }

    @Override
    public void person1() {
        System.out.println("person1");
    }
}
