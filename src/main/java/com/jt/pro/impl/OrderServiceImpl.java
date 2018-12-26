package com.jt.pro.impl;

import com.jt.pro.service.OrderService;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public void saveOrder() {
        System.out.println("保存订单成功");
    }

    @Override
    public void deleteOrder() {
        System.out.println("删除订单成功");
    }
}
