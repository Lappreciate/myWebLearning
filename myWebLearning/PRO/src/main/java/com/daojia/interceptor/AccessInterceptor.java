package com.daojia.interceptor;


import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AccessInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

        HandlerMethod handlerMethod = (HandlerMethod) handler;

        System.out.println("Request信息--------------------------------------: ");
        System.out.println("RequestURI: " +request.getRequestURI());
        System.out.println();

        System.out.println("hander信息--------------------------------------: ");
        System.out.println("方法名 "+handlerMethod.getMethod().getName());
        MethodParameter[] methodParameters = handlerMethod.getMethodParameters();
        for(MethodParameter mp : methodParameters){
            System.out.println("方法参数 "+mp.getParameterName());
        }
        System.out.println();

        return true;
    }
}
