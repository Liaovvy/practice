package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/27 - 01 - 27 - 11:51
 * @Description: heima.thread
 * @version: 1.0
 */
public class RunImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建一个性的线程执行！！！");
    }
}
