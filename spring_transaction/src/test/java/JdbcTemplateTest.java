import com.atguigu.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: yuguo
 * @Date: 2022/11/22 - 11 - 22 - 16:01
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
//指定当前测试类在spring的测试环境中执行，此时就可以通过注入的方式直接获取IOC容器中bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert(){
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"root0","123",23,"女","12345qq.com");
    }

    @Test
    public void testGetUserById(){
        String sql = "select * from t_user where user_id = ?";
        User query = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(query);
    }

    @Test
    public void testGetAllUser(){
        String sql = "select * from t_user";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        query.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        String sql = "select count(*) from t_user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
    }
}
