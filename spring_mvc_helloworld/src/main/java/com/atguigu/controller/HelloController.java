package com.atguigu.controller;

import javafx.scene.shape.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yuguo
 * @Date: 2022/11/27 - 11 - 27 - 20:33
 * @Description: com.atguigu.controller
 * @version: 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
