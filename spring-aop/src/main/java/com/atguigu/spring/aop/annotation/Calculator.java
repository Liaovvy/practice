package com.atguigu.spring.aop.annotation;

/**
 * @Auther: yuguo
 * @Date: 2022/11/20 - 11 - 20 - 16:28
 * @Description: com.atguigu.spring.proxy
 * @version: 1.0
 */
public interface Calculator {
    int add(int i, int j);
    int sub(int i, int j);
    int mul(int i, int j);
    int div(int i, int j);
}
