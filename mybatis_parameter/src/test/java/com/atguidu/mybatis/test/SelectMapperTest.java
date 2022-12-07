package com.atguidu.mybatis.test;

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.invoke.VarHandle;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Map;

/**
 * @Auther: yuguo
 * @Date: 2022/11/6 - 11 - 06 - 15:21
 * @Description: com.atguidu.mybatis.test
 * @version: 1.0
 */
public class SelectMapperTest {
    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer i = mapper.getCount();
        System.out.println(i);
    }
    @Test
    public void testGetUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdToMap = mapper.getUserByIdToMap(1);
        System.out.println(userByIdToMap);
    }


    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        /*List<Map<String,Object>> userByIdToMap = mapper.getAllUserToMap();*/
        Map<String, Object> userByIdToMap = mapper.getAllUserToMap();
        System.out.println(userByIdToMap);
    }


}