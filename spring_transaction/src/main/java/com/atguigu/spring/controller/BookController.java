package com.atguigu.spring.controller;

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Auther: yuguo
 * @Date: 2022/11/23 - 11 - 23 - 11:53
 * @Description: com.atguigu.spring.controller
 * @version: 1.0
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId){
        bookService.buyBook(userId,bookId);
    }
    public void checkout(Integer userId,Integer[] bookId){
        checkoutService.checkout(userId,bookId);
    }
}
