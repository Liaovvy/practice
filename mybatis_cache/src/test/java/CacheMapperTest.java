import com.atguigu.mybatis.mapper.CacheMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: yuguo
 * @Date: 2022/11/13 - 11 - 13 - 15:15
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class CacheMapperTest {
    /*
    * mybatis的一级缓存
    * Mybatis的一级缓存是SqlSession级别的，即通过一个SqlSession查询的数据会被缓存
    * 再次使用同一个SqlSession查询同一条数据，会从缓存中获取
    * 使一级缓存失效的四种情况：
    * 1.不同的SqlSession对应不同的一级缓存
    * 2.同一个SqlSession但查询条件不同
    * 3.同一个SqlSession两次查询期间执行了任何一次增删改操作
    * 4.同一个SqlSession两次查询期间手动清空了缓存
    *
    * MyBatis的二级缓存：
    * SqlSessionFactory级别的，通过同一个SqlSessionFactory所获取的SqlSession对象
    * 查询的数据会被缓存，再通过同一个SqlSessionFactory所获取的SqlSession查询相同的数据会从缓存中获取
    * MyBatis二级缓存开启的条件
    * a.在核心配置文件中，设置全局配置属性cacheEnabled=“true”，默认为true，不需要设置
    * b.在映射文件中设置标签<cache/>
    * c.二级缓存必须在SqlSession关闭或提交之后有效
    * d.查询的数据转换的实体类类型必须序列化的接口
    * */
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(1);
        System.out.println(empById);
        Emp empById1 = mapper.getEmpById(1);
        System.out.println(empById1);
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById2 = mapper1.getEmpById(1);
        System.out.println(empById2);
    }

    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = build.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpById(1);
        System.out.println(emp1);
        sqlSession1.close();
        SqlSession sqlSession2 = build.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpById(1);
        System.out.println(emp2);
        sqlSession2.close();
    }
}
