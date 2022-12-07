import com.atguigu.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yuguo
 * @Date: 2022/11/16 - 11 - 16 - 9:34
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class HelloWorldTest {
    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloworld = (HelloWorld)ioc.getBean("helloworld");
        helloworld.hello();
    }
}
