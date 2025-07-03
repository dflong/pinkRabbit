package com.dfl.pinkRabbit.mybatis.service;


import com.dfl.pinkRabbit.mybatis.mapper.OrderMapper;
import com.dfl.pinkRabbit.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void say() {
        System.out.println(userMapper.getUser());
        System.out.println(orderMapper.getOrderNo());
    }
}
