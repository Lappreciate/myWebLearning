package com.daojia.controller;


import com.daojia.Service.Impl.FirstPublish;
import com.daojia.User.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class aspectTest {

    @Autowired
    private Person person;

    @Autowired
    private FirstPublish firstPublish;

    @Test
    public void func1(){
        person.getNumById(1000L);
    }

    @Test
    public void func2(){
        firstPublish.publish();
    }

}
