package com.jt.pro.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Aspect
@Service
public class TimeAspect {
    long start ,end;
    @Pointcut("bean(orderService)")
    public void pointcut(){}
    /**增强功能：前置通知(业务方法执行之前执行)*/
    @Before("pointcut()")
    public void begin(){
        start=System.nanoTime();
        System.out.println("start:"+start);
    }
    /**增强功能：最终通知(业务方法执行最后执行，
     *无论业务方法是否执行成功，此功能都要执行)*/
    @After("pointcut()")
    public void end(){
        end =System.nanoTime();
        System.out.println("end:"+end);
        System.out.println(("经历时间：" + (end - start) / 1000000L+ "秒"));
    }

}
