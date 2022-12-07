package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther: yuguo
 * @Date: 2022/11/29 - 11 - 29 - 16:22
 * @Description: com.atguigu.controller
 * @version: 1.0
 * 获取请求参数的方式：
 * 1.通过servletAPI获取
 * 只需要在控制器方法的形参设置HttpServletRequest类型的形参
 * 就可以在控制器方法中使用request对象获取请求参数
 * 2.通过控制器方法的形参获取
 * 只需要在控制器方法的形参位置，设置一个形参，形参的名字和请求参数的名字一致即可
 * 3.@RequestParam：将请求参数和控制器方法的形参绑定
 * 三个属性：value，required，defaultValue
 * value：设置形参绑定的请求参数的名字
 * required：设置该参数的值是否必须，true必须，即会报错。
 * defaultValue：设置当前传输value所对应的请求参数时，为形参设置的默认值，此时和required属性值无关
 * 4.@RequestHeader:将请求头信息和控制器方法的形参绑定
 * 5.@CookieValue：将cookie数据和控制器方法的形参绑定
 * 6.通过控制器方法的实体类类型的形参获取参数
 * 需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的属性的属性名和请求参数的名字一致
 * 可以通过实体类类型的形参获取请求参数
 * 7.解决获取请求参数的乱码问题
 * 在web.xml中配置Spring的编码过滤器CharacterEncodingFilter
 */
@Controller
public class TestParamController {
    @RequestMapping("/param/servletAPI")
    public String getParamByServletAPI(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        System.out.println("username:"+username+" password:"+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(
            @RequestParam(value = "userName",required = false,defaultValue = "liaoweiyu")String username,
            String password,
            @RequestHeader(value = "referer") String referer,
            @CookieValue("JSESSIONID")String jessionId
            ){
        System.out.println("jssionId:"+jessionId);
        System.out.println("referer:"+referer);
        System.out.println("username:"+username+" password:"+password);
        return "success";
    }
    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
