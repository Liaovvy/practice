import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @Auther: yuguo
 * @Date: 2022/11/21 - 11 - 21 - 16:05
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class ProxyTest {
    /*
    * 动态代理有两种：
    * 1.jdk动态代理，要求必须有接口，最终生成的代理类在com.sun.proxy包下，类名为$proxy2
    * 2.cglib动态代理，通过继承被代理的目标类实现代理，所以不需要目标接口。
    * */
    @Test
    public void testProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.sub(1,1);
    }
}
