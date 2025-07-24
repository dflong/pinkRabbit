package com.dfl.pinkRabbit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Import({Man.class})
public class GoodsService {

//    @Autowired
//    OrderService orderService;

//    @Autowired
//    JdbcTemplate jdbcTemplate;

//    public GoodsService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void say(){
        System.out.println("卖货了");
    }

//    @Transactional
    public void insert() {
//        jdbcTemplate.execute("insert into user(openid, nickname)" +
//                "values(222222,'zhangzhang')");
    }
}
