package com.daojia.multiDataSource;

public class HandlerDataSource {

    private static ThreadLocal<String> dataSourceThreadLocal = new ThreadLocal<String>();

    public static void putDataSource(String dataSource){
        dataSourceThreadLocal.set(dataSource);
    }

    public static String getDataSource(){
        return dataSourceThreadLocal.get();
    }
}
