package com.lsy.StreamLearn.funcInterface;


import com.lsy.StreamLearn.entity.Student;

import java.util.*;

public class FuncInterfa {

    private static final List<Student> list = new ArrayList<>();

    private static final Map<String,Student> map = new HashMap<>();

    public static void buildList(){
        Student s1 = new Student(1,"lsy",20);
        Student s2 = new Student(2,"cls",21);
        Student s3 = new Student(3,"zy",20);
        Student s4 = new Student(4,"gs",23);
        Student s5 = new Student(5,"sjk",19);
        Student s6 = new Student(6,"lj",15);
        Student s7 = new Student(7,"xz",20);
        Student s8 = new Student(8,"sly",24);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
    }

    public static void buildMap(){
        Student s1 = new Student(1,"lsy",20);
        Student s2 = new Student(2,"cls",21);
        Student s3 = new Student(3,"zy",20);
        Student s4 = new Student(4,"gs",23);
        Student s5 = new Student(5,"sjk",19);
        Student s6 = new Student(6,"lj",15);
        Student s7 = new Student(7,"xz",20);
        Student s8 = new Student(8,"sly",24);
        map.put("1",s1);
        map.put("2",s2);
        map.put("3",s3);
        map.put("4",s4);
        map.put("5",s5);
        map.put("6",s6);
        map.put("7",s7);
        map.put("8",s8);
    }

    public static void stuFilter(List<Student> stus, JudgeCondition condition){

        //List<Student> list = stus.stream().filter(s->condition.judge(s)).collect(Collectors.toList());
        //distinct 去重
        //List<Student> list = stus.stream().filter(s->condition.judge(s)).distinct().collect(Collectors.toList());

        //sorted 排序
        //List<Student> list = stus.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).collect(Collectors.toList());

        //limit限制  只有前6个
        //List<Student> list = stus.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).limit(6).collect(Collectors.toList());

        //skip跳过  15 19 20没有了  前三个被跳过去了
        //List<Student> list = stus.stream().sorted((s1,s2)->s1.getAge()-s2.getAge()).skip(3).collect(Collectors.toList());
//        for(Student s : list){
//            System.out.println("name: "+s.getName()+"--- age: "+s.getAge());
//        }


        //映射 map
//        List<String> list = stus.stream().filter(s -> 20 == s.getAge()).map(Student::getName).collect(Collectors.toList());
//        for(String name : list){
//            System.out.println(name);
//        }

        //映射 mapToInt
//        int sum = stus.stream().filter(s -> 20 == s.getAge()).mapToInt(Student::getId).sum();
//        System.out.println(sum);



    }

    public static void main(String[] args) {
//        buildList();
//        stuFilter(list, student -> {
//            return student.getAge()>21;
//        });

        buildMap();
        Optional<Map.Entry<String, Student>> str = map.entrySet().stream()
                .filter(mp-> mp.getValue().getName().equals("cls")).findFirst();
        Map.Entry<String, Student> m = str.get();
        System.out.print(m.getKey());





    }
}
