package com.atguigu.spring.service;

/**
 * @Auther: yuguo
 * @Date: 2022/11/27 - 11 - 27 - 10:09
 * @Description: com.atguigu.spring.service
 * @version: 1.0
 */
public interface CheckoutService {
    void checkout(Integer userId,Integer[] bookId);
}
