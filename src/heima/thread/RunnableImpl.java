package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/16 - 01 - 16 - 16:55
 * @Description: heima.thread
 * @version: 1.0
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-->"+ticket+"张");
                ticket--;
            }
        }
    }
}
