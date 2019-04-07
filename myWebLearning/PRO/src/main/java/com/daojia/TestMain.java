package com.daojia;

public class TestMain {
    public static void main1(String[] args) {
        String packageName1 = "com/daojia/Service/Impl";
        //获取该包下所有带有@Service注解的类
        Utils.getClassNameAtPackage(packageName1);
    }


    public static void main(String[] args) {
        String packageName1 = "com/daojia/Service/Impl";
        Utils.getClassNameAtPackage(packageName1);
    }
}
