package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: yuguo
 * @Date: 2022/11/28 - 11 - 28 - 15:53
 * @Description: com.atguigu.controller
 * @version: 1.0
 * @RequestMapping标识一个类：设置映射请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求路径的具体信息
 * @RequestMapping注解value属性
 * 作用：通过请求的请求路径匹配请求
 * value属性是数组类型，即当前浏览器所发送请求的请求路径匹配value属性中的任何一个值
 * 则当前请求就会被注解标识的方法进行处理
 * 3.@RequestMapping注解的method属性
 * 作用：通过请求的请求方式匹配请求
 * method属性是RequestMethod类型的数组，即当前浏览器所发送请求的请求方式匹配method属性中的任何一种请求方式
 * 若浏览器所发送的请求的请求路径和@RequestMapping注解的value属性匹配，但是请求方式不匹配
 * 此时页面报错405
 * 在@RequestMapping的基础上，结合请求方式的一些派生注解：
 * @GetMapping,@PostMapping,@DeleteMapping,@PutMapping
 * params属性：
 * 作用：通过请求的请求参数匹配请求，即浏览器发送的请求的参数必须满足params属性的设置
 * "param":表示当前所匹配请求的请求参数中必须携带param参数
 * "!param":表示当前所匹配请求的请求参数中不一定携带param参数
 * "param=value":表示当前所匹配请求的请求参数中必须携带param参数且必须为value
 * "param！=value":表示当前所匹配请求的请求参数中可以不携带param参数，携带值一定不是value
 *
 *  value属性中：可以设置特殊字符
 *  ?:任意单个字符
 *  *：任意个数的任意字符（不包括？和/）
 *  **：任意层数的任意目录，注意使用方式是只能**写在双斜线中。
 *
 * @RequestMapping注解使用路径中的占位符
 * 传统：/deleteUser?id=1
 * rest:/user/delete/1
 * 需要在@RequestMapping注解的value属性中所设置的路径中，使用{XXX}的方式表示路径中的数据
 * 在通过@PathVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
 */
@Controller
@RequestMapping("/test")
public class TestRequestMappingController {


    //此时控制器的方法所匹配的请求路径为/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.POST,RequestMethod.GET}
            //params = {"username","!password","age=20","gender!=女"}
            //headers = {"referer"}
    )
     String hello(){
        return "success";
    }

    @RequestMapping("/a/**/a/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/rest/{username}/{id}")
    public String testRest(@PathVariable("id")Integer id,@PathVariable("username")String username){
        System.out.println("id:"+id+"username:"+username);
        return "success";
    }

}