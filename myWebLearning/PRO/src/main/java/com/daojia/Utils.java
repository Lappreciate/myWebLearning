package com.daojia;

import org.springframework.stereotype.Service;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static void getClassNameAtPackage(String url) {
        List<String> classNames = getClassName(url);
        for (String className : classNames) {
            System.out.println(className);
        }
    }

    public static List<String> getClassName(String packageName) {

        //package：com/daojia/Service/Impl
        //返回值
        List<String> classNameLists = new ArrayList<>();
        //当前classpath路径  绝对路径
        //url：/C:/Users/daojia/IdeaProjects/myWebLearning/Provider/target/classes/
        URL url = ClassLoader.getSystemResource("");

        //filepath:/C:/Users/daojia/IdeaProjects/myWebLearning/Provider/target/classes/com/daojia/Service/Impl
        String filePath = url.getPath() + packageName.replace(".", "/");

        File file = new File(filePath);
        //根据filepath可以获得该绝对路径下的所有文件
        File[] childFiles = file.listFiles();

        Class clazz;
        for (File file1 : childFiles) {
            String childFilePath = file1.getPath();
            //childFilePath：C:\Users\daojia\IdeaProjects\myWebLearning\Provider\target\classes\com\daojia\Service\Impl\Doctor.class
            String[] clazzName = childFilePath.split("\\\\");
            String classNameTmp = clazzName[clazzName.length - 1];
            //classNameTmp：Doctor.class
            String className = classNameTmp.split("\\.")[0];
            //className:Doctor  最终目的也是为了取出这个类名Doctor
            try {
                String a = packageName.replace("/", ".") + "." + className;
                clazz = Class.forName(packageName.replace("/", ".") + "." + className);
                if (clazz.isAnnotationPresent(Service.class)) {
                    classNameLists.add(clazz.getName());
                }
            } catch (Exception e) {

            }
        }
        return classNameLists;
    }
}

