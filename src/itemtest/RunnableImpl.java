package itemtest;

/**
 * @Auther: yuguo
 * @Date: 2022/1/28 - 01 - 28 - 15:54
 * @Description: itemtest
 * @version: 1.0
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"新的线程创建");
    }
}
