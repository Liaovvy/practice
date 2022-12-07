package itemtest;

/**
 * @Auther: yuguo
 * @Date: 2022/2/7 - 02 - 07 - 14:07
 * @Description: itemtest
 * @version: 1.0
 */
public class Demo05Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int c) {
                return a+c;
            }
        });

        //使用Lambda表达式简化匿名内部类的书写
        invokeCalc(10,20,(int a,int b)->{
            return a+b;
        });
    }

    /*//定义一个方法
    * 参数传递两个int类型的整数
    * 参数传递Calculator接口
    * 方法内部调用Calculator中的方法calc计算两个整数的和
    * */
    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
