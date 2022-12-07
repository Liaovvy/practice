package com.atguigu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Auther: yuguo
 * @Date: 2022/11/21 - 11 - 21 - 15:43
 * @Description: com.atguigu.spring.proxy
 * @version: 1.0
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        /*
        ClassLoader loader:指定加载动态生成的代理类的类加载器
        Class[] interfaces:获取目标对象实现的所有的class对象的数组
        InvocationHandler h:设置代理类中的抽象方法如何重写
        */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("日志，方法："+method.getName()+"参数"+ Arrays.toString(args));
                //proxy表示代理对象，method表示要执行的方法，args表示要执行的方法到参数的列表
                Object invoke = method.invoke(target, args);
                System.out.println("日志，方法："+method.getName()+"结果"+ invoke);
                return invoke;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
