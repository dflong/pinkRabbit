package com.dfl.pinkRabbit.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

    @Select("select order_no from orders limit 1")
    String getOrderNo();
}
