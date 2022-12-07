package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Auther: yuguo
 * @Date: 2022/11/19 - 11 - 19 - 16:01
 * @Description: com.atguigu.spring.dao.impl
 * @version: 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存成功");
    }
}
