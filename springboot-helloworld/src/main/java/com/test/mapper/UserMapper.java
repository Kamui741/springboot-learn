package com.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    @Insert("insert into users values(null,#{userName},#{age});")
    int insertUser(@Param("userName") String userName, @Param("age") Integer age);

}
