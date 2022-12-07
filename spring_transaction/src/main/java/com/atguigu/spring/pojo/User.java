package com.atguigu.spring.pojo;

/**
 * @Auther: yuguo
 * @Date: 2022/7/22 - 07 - 22 - 20:20
 * @Description: com.atguigu.mybatis.pojo
 * @version: 1.0
 */
public class User {
    private Integer user_id;
    private String username;
    private Integer balance;

    public User(Integer user_id, String username, Integer balance) {
        this.user_id = user_id;
        this.username = username;
        this.balance = balance;
    }

    public User() {
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + user_id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
