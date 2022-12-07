package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/16 - 01 - 16 - 16:57
 * @Description: heima.thread
 * @version: 1.0
 */
public class demo01Tickettest {
    public static void main(String[] args) {
        RunnableImpl r1 = new RunnableImpl();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t2.start();
        t3.start();
    }
}
