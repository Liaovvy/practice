package com.atguigu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.*;
import java.sql.SQLException;

/**
 * @Auther: yuguo
 * @Date: 2022/11/17 - 11 - 17 - 16:39
 * @Description: com.atguigu.spring.test
 * @version: 1.0
 */
public class DataSourceTest {
    @Test
    public void testDataSource() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
        DruidDataSource bean = ioc.getBean(DruidDataSource.class);
        System.out.println(bean.getConnection());
    }
}
