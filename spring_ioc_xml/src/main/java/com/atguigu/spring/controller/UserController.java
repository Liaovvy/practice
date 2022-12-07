package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import com.atguigu.spring.service.impl.UserServiceImpl;

/**
 * @Auther: yuguo
 * @Date: 2022/11/19 - 11 - 19 - 10:13
 * @Description: com.atguigu.spring.controller
 * @version: 1.0
 */
public class UserController {
    private UserService userService;

    public UserController() {
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }

}
