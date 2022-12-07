package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/8 - 11 - 08 - 15:30
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface EmpMapper {
    Emp getEmpByEmpId(@Param("empId")Integer empId);

    Emp getEmpAndDeptByEmpId(@Param("empId")Integer empId);

    Emp getEmpAndDeptByStepOne(@Param("empId")Integer empId);

    List<Emp> getDeptAndEMpByStepTwo(@Param("DeptId")Integer DeptId);
}
