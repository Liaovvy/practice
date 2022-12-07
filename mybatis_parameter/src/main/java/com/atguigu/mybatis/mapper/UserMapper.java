package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Auther: yuguo
 * @Date: 2022/11/3 - 11 - 03 - 16:23
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 * #{}的本质是占位符赋值，${}的本质是字符串拼接
 * 1.若mapper接口方法的参数为单个的字面量类型
 * 此时可以通过#{}和${}以任意的内容获取参数值，一定要注意${}的单引号问题
 * 2.若mapper接口方法的参数为多个的字面量类型
 * 此时Mybatis会将参数放在map集合中，以两种方式存储数据
 * a>以arg0,arg1....为键，以参数为值
 * b>以param1，param2....为键，以参数为值
 * 因此，只需要通过#{}和${}访问map集合的键，就可以获取相对应的值,一定要注意${}的单引号问题
 * 3.若mapper接口方法的参数map集合类型的餐宿
 * 只需要通过#{}和${}访问map集合的键，就可以获取相对应的值，一定要注意${}单引号的问题
 * 4.若mapper接口方法的参数为实体类型的参数
 * 只需要通过#{}和${}访问map集合的键，就可以获取相对应的值,一定要注意${}的单引号问题
 * 5.可以在mapper接口方法的参数上设置@Param注解
 * 此时Mybatis将这些参数放在map中，以两种方式进行存储
 * a>以@Param注解的value属性值为键，以参数为值
 * b>以param1，param2...为键，以参数为值
 */
public interface UserMapper {
    //根据用户名查询用户信息
    User getUserByUsername(String username);

    //验证登录
    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);

    void insertUser(User user);

    /**
     *
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username")String username,@Param("password") String password);
}
