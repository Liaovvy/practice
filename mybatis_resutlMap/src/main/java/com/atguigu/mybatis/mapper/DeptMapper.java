package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: yuguo
 * @Date: 2022/11/8 - 11 - 08 - 22:02
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId")Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId")Integer DeptId);

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
