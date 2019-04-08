package com.daojia.Controller;

import com.daojia.Service.Impl.FirstPublish;
import com.daojia.User.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;






@Controller
@RequestMapping("/hello")
public class PersonController {

    @Autowired
    private Person person;

    @Value("${myWebLearning.sys.url}")
    private String url;

    @Autowired
    private FirstPublish firstPublish;

    @RequestMapping("/test1")
    public void test1(String str){
        person.getNumById(1000L);
        System.out.println(url);
    }

    @RequestMapping("/event")
    public void test2(){
        firstPublish.publish();
    }

    @RequestMapping("/mybat")
    public void test3(){
        person.mybatis_test();
    }


}
