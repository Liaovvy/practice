package itemtest;

import java.net.SocketTimeoutException;

/**
 * @Auther: yuguo
 * @Date: 2022/1/28 - 01 - 28 - 15:56
 * @Description: itemtest
 * @version: 1.0
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //创建Runnable接口的实现对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递RUnnable接口的实现类
        Thread t = new Thread(run);
        t.start();

        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        };
        new Thread(r).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程创建了");
            }
        }).start();
    }
}