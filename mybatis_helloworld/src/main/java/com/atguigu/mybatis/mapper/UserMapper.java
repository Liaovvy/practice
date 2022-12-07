package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/7/23 - 07 - 23 - 16:22
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface UserMapper {
    //添加用户信息
    int insertUser();
    //修改用户信息
    void updateUser();
    //删除用户信息
    void deleteUser();
    //查询用户信息
    User getUserById();

    List<User> getAllUser();
}
