package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/11 - 11 - 11 - 16:13
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface DynamicSQLMapper {
    /*
    根据条件
    * */
    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    void insertMoreEmp(@Param("emps")List<Emp> emps);

    void deleteMoreEmp(@Param("empIds")Integer[] empIds);

}
