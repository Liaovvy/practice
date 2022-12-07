package com.atguigu.spring.process;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleSelectSubqueryTableSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Auther: yuguo
 * @Date: 2022/11/18 - 11 - 18 - 10:26
 * @Description: com.atguigu.spring.process
 * @version: 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //此方法在bean的生命周期初始化之前执行
        System.out.println("后置处理器的前置方法");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //次方法在bean的生命周期初始化之后执行
        System.out.println("后置处理器的后置方法");
        return bean;
    }
}
