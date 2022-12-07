package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: yuguo
 * @Date: 2022/11/6 - 11 - 06 - 15:20
 * @Description: com.atguigu.mybatis.mapper
 * @version: 1.0
 */
public interface SelectMapper {

    User getUserById(@Param("id")Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByIdToMap(@Param("id")Integer id);

/*    List<Map<String,Object>> getAllUserToMap();*/

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案：
     * 1.将mapper接口方法的返回值设置为泛型还是map的list集合
     * 2.可以将每条数据转换的map集合放在一个大的map中，但必须要通过注解@MapKey
     * @return
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();


}
