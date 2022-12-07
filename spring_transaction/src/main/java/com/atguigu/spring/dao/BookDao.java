package com.atguigu.spring.dao;

/**
 * @Auther: yuguo
 * @Date: 2022/11/23 - 11 - 23 - 11:54
 * @Description: com.atguigu.spring.dao
 * @version: 1.0
 */
public interface BookDao {
    public int getPriceByBookId(Integer bookId);
    public void updateStock(Integer bookId);
    public void updateBalance(Integer userId,Integer price);
}
