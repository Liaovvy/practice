package com.atguigu.spring.controller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @Auther: yuguo
 * @Date: 2022/11/19 - 11 - 19 - 15:59
 * @Description: com.atguigu.spring.controller
 * @version: 1.0
 */
//@Controller("controller")
@Controller
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
