package com.daojia.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    /**
     * 前置通知
     */
    @Pointcut("execution(* com.daojia.Service.Impl..*.*(..))")
    public void logInfo(){

    }

    @Before("logInfo()")
    public void before(){
        System.out.println("前置通知....");

    }


    @After("logInfo()")
    public void after(){
        System.out.println("最终通知....");
    }



    /**
     * 环绕通知
     * @param point 可用于执行切点的类
     * @return
     * @throws Throwable
     */
    @Around("logInfo()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知前....");
        Class<?> targetClass = point.getTarget().getClass();
        Object[] args = point.getArgs();

        System.out.println("调用的类是："+targetClass.getCanonicalName());
        System.out.println("调用的方法是："+point.getSignature().getName());
        Object obj= (Object) point.proceed();
        System.out.println("环绕通知后....");
        return obj;
    }


}
