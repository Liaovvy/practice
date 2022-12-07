package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/7 - 11 - 07 - 15:17
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface SpecialSQLMapper {
    List<User> getUserByLike(@Param("mohu")String mohu);

    int deleteMore(@Param("ids") String ids);

    List<User> getUserList(@Param("tableName")String tableName);

    void insertUser(User user);
}
