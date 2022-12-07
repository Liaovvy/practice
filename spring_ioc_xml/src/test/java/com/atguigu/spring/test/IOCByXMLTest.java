package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yuguo
 * @Date: 2022/11/16 - 11 - 16 - 9:44
 * @Description: com.atguigu.spring.test
 * @version: 1.0
 */
public class IOCByXMLTest {
    /*
    * 获取bean的三种方式：
    * 1.根据bean的id获取
    * 2.根据bean的类型获取
    * 注意：根据类型获取bean时，要求IOC容器中有且只有一个类型匹配的bean
    * 若没有任何一个类型匹配的bean，此时抛出异常：NoUniqueBeanDefinitionException
    * 3.根据bean的id和类型获取
    * 根据类型来获取bean时，在满足bean唯一性的前提下
    * 其实只是看：对象  instanceof 指定的类型 的返回结果
    * 只要返回的是true就可以认定为和类型匹配，能够获取到
    * 即通过bean的类型，bean所继承的类的类型，bean所实现的接口的类型都可以获取bean
    * */

    @Test
    public void testIOC(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        //Student bean = ioc.getBean(Student.class);
        Student studentOne = ioc.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void testDI(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        //Student bean = ioc.getBean(Student.class);
        Student studentOne = ioc.getBean("studentOne", Student.class);
        Integer age = studentOne.getAge();
        System.out.println(age);
    }
    @Test
    public void testDIS(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        //Student bean = ioc.getBean(Student.class);
        Student studentTwo = ioc.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }
    @Test
    public void testDIS1(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        //Student bean = ioc.getBean(Student.class);
        Student studentThree = ioc.getBean("studentThree", Student.class);
        System.out.println(studentThree);
    }
    @Test
    public void testDI5(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Student studentOne = (Student)ioc.getBean("studentOne");
        //Student bean = ioc.getBean(Student.class);
        Clazz clazzOne = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(clazzOne);
    }
}
