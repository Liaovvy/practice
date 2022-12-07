package com.atguigu.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @Auther: yuguo
 * @Date: 2022/11/20 - 11 - 20 - 16:29
 * @Description: com.atguigu.spring.proxy
 * @version: 1.0
 */
@Component
public class CalculatorImpl implements Calculator{
    public int add(int i, int j) {
        int result;
        result = i + j;
        System.out.println("方法内部，result："+result);
        return result;
    }

    public int sub(int i, int j) {
        int result;
        result = i - j;
        System.out.println("方法内部，result："+result);
        return result;
    }

    public int mul(int i, int j) {
        int result;
        result = i * j;
        System.out.println("方法内部，result："+result);
        return result;
    }

    public int div(int i, int j) {
        int result;
        result = i / j;
        System.out.println("方法内部，result："+result);
        return result;
    }
}
