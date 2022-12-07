package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;

/**
 * @Auther: yuguo
 * @Date: 2022/11/19 - 11 - 19 - 10:15
 * @Description: com.atguigu.spring.service.impl
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        userDao.saveUser();
    }
}
