package com.jt.pro.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * comment:
 */
@ComponentScan(basePackages = {"com.jt.pro"})
@EnableAspectJAutoProxy//启用AOP注解(自动为目标对象创建代理对象)
public class ModelConfig {
}
