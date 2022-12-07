package com.atguigu.spring.proxy;

/**
 * @Auther: yuguo
 * @Date: 2022/11/21 - 11 - 21 - 15:36
 * @Description: com.atguigu.spring.proxy
 * @version: 1.0
 */
public class CalculatorsStaticProxy implements Calculator {

    private CalculatorImpl calculatorImpl;

    public CalculatorsStaticProxy(CalculatorImpl calculatorImpl) {
        this.calculatorImpl = calculatorImpl;
    }

    public int add(int i, int j) {
        System.out.println("日志，方法：add，参数："+i+"，"+j);
        int add = calculatorImpl.add(i, j);
        System.out.println("日志，方法：add，结果："+add);
        return 0;
    }

    public int sub(int i, int j) {
        return 0;
    }

    public int mul(int i, int j) {
        return 0;
    }

    public int div(int i, int j) {
        return 0;
    }
}
