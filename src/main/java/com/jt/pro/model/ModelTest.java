package com.jt.pro.model;

import com.jt.pro.common.ModelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ModelTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ModelConfig.class);
        Role2 role = anno.getBean(Role2.class);
        System.out.println(role.getRoleName());
        anno.close();
    }
}
