package heima.thread;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: yuguo
 * @Date: 2022/1/27 - 01 - 27 - 11:40
 * @Description: heima.thread
 * @version: 1.0
 * static ExecutorService newFixedThreadPool(int nThreads)创建一个可重用固定线程数的线程池
 * 参数：
 *      int nThreads: 创建线程池中包含的线程数量
 * 返回值：
 *      ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口变成）
 * java.util.concurrent.ExecutorService：线程池接口
 * 用来从线程池中获取线程，调用start方法，执行线程任务
 * submit（Runnable task）提交一个Runnable任务用于执行
 * 使用步骤：
 *      1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
 *      2.创建一个类，实现Runnable接口，重写run方法，设置线程任务。
 *      3.调用ExecutorService中的方法submit，传递线程任务（实现类），开启线程，执行run方法
 *      4.调用ExecutorService中的方法shutdown销毁线程池（不建议执行）
 */
public class Demo03ThreadPool {
    public static void main(String[] args) {
        ExecutorService es;
        es = Executors.newFixedThreadPool(2);
        es.submit(new RunImpl());
        es.submit(new RunImpl());
        es.submit(new RunImpl());
        //线程池会已知开启，使用完线程，会自动把线程归还给线程池，线程可以继续使用。
        es.shutdown();

    }

}
