import com.atguigu.spring.aop.annotation.Calculator;
import com.atguigu.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yuguo
 * @Date: 2022/11/22 - 11 - 22 - 10:36
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class AOPTest {
    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.div(10,1);
    }
}
