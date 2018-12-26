package com.jt;

import com.jt.pro.common.ModelConfig;
import com.jt.pro.service.OrderService;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    private AnnotationConfigApplicationContext ctx;
    @Test
    public void testSayHello(){
        ctx =
                new AnnotationConfigApplicationContext(
                        ModelConfig.class);
        OrderService os=(OrderService)
                ctx.getBean("orderService",
                        OrderService.class);
        //3.执行业务方法
        os.saveOrder();
        os.deleteOrder();

    }
    @After
    public void destory(){
        ctx.close();
    }


}
