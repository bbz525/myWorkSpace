package com.jt.pro.impl;

import com.jt.pro.service.HelloService;

public class HelloServiceImpl  implements HelloService {
    @Override
    public void sayHello(String msg) {
        System.out.println("hello aop:"+msg);
    }
}
