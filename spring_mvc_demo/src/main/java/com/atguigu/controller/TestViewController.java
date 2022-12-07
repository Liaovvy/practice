package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: yuguo
 * @Date: 2022/12/2 - 12 - 02 - 15:32
 * @Description: com.atguigu.controller
 * @version: 1.0
 */
@Controller
public class TestViewController {

    @RequestMapping("test/view/thymeleaf")
    public String testThymeleaf(){
        return "success";
    }

    @RequestMapping("/test/view/forward")
    public String testInsternalResourceView(){
        return "forward:/test/map";
    }

    @RequestMapping("test/view/redirect")
    public String testRedirectView(){
        return "redirect:/test/model";
    }
}
