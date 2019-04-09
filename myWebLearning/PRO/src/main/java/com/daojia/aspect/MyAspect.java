package com.daojia.aspect;

import com.daojia.DataSourceType;
import com.daojia.multiDataSource.HandlerDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyAspect {

    //Impl.表示  该包下 不包含子包
    @Pointcut("execution(* com.daojia.Service.Impl.*.*(..))")
    public void logInfo(){

    }

    //Impl..表示  该包下 以及子包下
    @Pointcut("execution(* com.daojia.Service.Impl..*.insert*(..))")
    public void DataSourceAopHandler(){
    }

    /**
     * 前置通知  基本日志打印
     */
    @Before("logInfo()")
    public void before(){
        System.out.println("aop---------------前置通知start....");
        System.out.println();


        System.out.println();
        System.out.println("aop---------------前置通知end....");
    }


    /**
     * 前置通知  针对数据源切换功能
     */
    @Before("DataSourceAopHandler()")
    public void beforeDataSource(JoinPoint joinPoint){
        System.out.println("aop---------------前置通知start....");
        System.out.println();
        System.out.println("DataSourceAopHandler------------------------------------");

        Class clazz = joinPoint.getTarget().getClass();
        String methodName = joinPoint.getSignature().getName();
        Class[] params = ((MethodSignature)joinPoint.getSignature()).getParameterTypes();
        try {
            Method method= clazz.getMethod(methodName,params);
            if(method.isAnnotationPresent(DataSourceType.class)){
                DataSourceType type = method.getAnnotation(DataSourceType.class);
                String dataSource = type.value();
                HandlerDataSource.putDataSource(dataSource);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("aop---------------前置通知end....");

    }






//    /**
//     * 环绕通知
//     * @param point 可用于执行切点的类
//     * @return
//     * @throws Throwable
//     */
//    @Around("logInfo()")
//    public Object around(ProceedingJoinPoint point) throws Throwable {
//        System.out.println("环绕通知前....");
//        Class<?> targetClass = point.getTarget().getClass();
//        Object[] args = point.getArgs();
//
//        System.out.println("调用的类是："+targetClass.getCanonicalName());
//        System.out.println("调用的方法是："+point.getSignature().getName());
//        Object obj= (Object) point.proceed();
//        System.out.println("环绕通知后....");
//        return obj;
//    }

    @After("logInfo()")
    public void after(){
        System.out.println("最终通知....");
    }


}
