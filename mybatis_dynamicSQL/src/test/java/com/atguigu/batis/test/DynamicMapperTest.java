package com.atguigu.batis.test;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/12 - 11 - 12 - 14:14
 * @Description: com.atguigu.batis.test
 * @version: 1.0
 */
public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"",20,"");
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        empByCondition.forEach(System.out::println);
    }
    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"",20,"");
        List<Emp> empByCondition = mapper.getEmpByChoose(emp);
        empByCondition.forEach(System.out::println);
    }
    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null,"小马1",20,"男");
        Emp emp2 = new Emp(null,"小马3",20,"男");
        Emp emp3 = new Emp(null,"小马2",20,"男");
        List<Emp> list = Arrays.asList(emp1,emp2,emp3);
        mapper.insertMoreEmp(list);
    }
    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{8,9};
        mapper.deleteMoreEmp(empIds);
    }
}
