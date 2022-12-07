package com.atguigu.spring.service.impl;

import com.atguigu.spring.service.BookService;
import com.atguigu.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;

/**
 * @Auther: yuguo
 * @Date: 2022/11/27 - 11 - 27 - 10:10
 * @Description: com.atguigu.spring.service.impl
 * @version: 1.0
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;

    @Override
    @Transactional
    public void checkout(Integer userId, Integer[] bookId) {
        for(Integer bookIds:bookId){
            bookService.buyBook(userId,bookIds);
        }
    }


}
