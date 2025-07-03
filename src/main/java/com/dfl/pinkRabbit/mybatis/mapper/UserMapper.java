package com.dfl.pinkRabbit.mybatis.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select nickname from user limit 1")
    String getUser();
}
