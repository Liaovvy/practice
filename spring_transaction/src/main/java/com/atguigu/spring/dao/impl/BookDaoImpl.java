package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.lang.model.element.VariableElement;

/**
 * @Auther: yuguo
 * @Date: 2022/11/23 - 11 - 23 - 11:54
 * @Description: com.atguigu.spring.dao.impl
 * @version: 1.0
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int getPriceByBookId(Integer bookId) {
        String sql = "select price from t_book where book_id = ?";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, bookId);
        return integer;
    }

    @Override
    public void updateStock(Integer bookId) {
        String sql = "update t_book set stock = stock -1 where book_id = ?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql,price,userId);
    }
}
