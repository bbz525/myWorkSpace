package com.jt.pro.aop;

public class LoggingAspect {
    public void beforeMethod(){
        System.out.println("method start");
    }
    public void afterMethod(){
        System.out.println("method end");
    }

}
