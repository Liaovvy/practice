package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Auther: yuguo
 * @Date: 2022/11/19 - 11 - 19 - 16:00
 * @Description: com.atguigu.spring.service.impl
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
    }
}
