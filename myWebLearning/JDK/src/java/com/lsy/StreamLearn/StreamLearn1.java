package com.lsy.StreamLearn;

import com.lsy.StreamLearn.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearn1 {

    public static void sortTest(){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Mahesh", 12));
        list.add(new Student(2, "Suresh", 15));
        list.add(new Student(3, "Nilesh", 10));

        list = list.stream().sorted((s1, s2) -> s1.getAge().compareTo(s2.getAge())).collect(Collectors.toList());
        print(list);



    }

    public static void print(List<Student> list){
        list.forEach(l->{
            System.out.println(l.getName()+"age::  "+l.getAge());
        });
    }


    public static void main(String[] args) {
        sortTest();
    }


}
