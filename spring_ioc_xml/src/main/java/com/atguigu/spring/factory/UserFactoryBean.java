package com.atguigu.spring.factory;

import com.atguigu.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Auther: yuguo
 * @Date: 2022/11/18 - 11 - 18 - 10:39
 * @Description: com.atguigu.spring.factory
 * @version: 1.0
 * FactoryBean：是一个接口，需要创建一个类实现该接口
 * 其中有三个方法：
 * getObject():通过一个对象交给IOC容器管理
 * getObjectType()：设置所提供对象的类型
 * isSingleton()：所提供的对象是否单例
 * 当把FactoryBean的实现配置为bean时，会将当前类中getObject()所返回的对象交给IOC容器管理
 */
public class UserFactoryBean implements FactoryBean<User> {
    public User getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }
}
