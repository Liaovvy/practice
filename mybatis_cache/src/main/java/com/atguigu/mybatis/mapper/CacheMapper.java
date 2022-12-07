package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: yuguo
 * @Date: 2022/11/13 - 11 - 13 - 15:12
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface CacheMapper {


    Emp getEmpById(@Param("empId")Integer empId);
}
