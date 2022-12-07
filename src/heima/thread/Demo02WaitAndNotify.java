package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/26 - 01 - 26 - 16:12
 * @Description: heima.thread
 * @version: 1.0
 * 进入到TimeWaiting（计时等待）有两种方式
 * 1.使用sleep（long m）方法，在毫秒结束之后，县城睡醒进入到Runnable/Blocked状态
 * 2.使用wait（long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程进入到Runnable/Blocked状态
 *
 * 唤醒的方法：
 * void notify() 唤醒在此对象监视器上等待的单个线程
 * void notifyAll() 唤醒在此对象监视器上等待的所有线程
 */
public class Demo02WaitAndNotify {

    public static void main(String[] args) {
       // Integer s = new Integer(1);
        Object obj = new Object();
        //创建一个顾客线程
        new Thread() {
            public void run() {
                while (true) {

                    synchronized (obj) {
                        System.out.println("11我要包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了11开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                while(true){

                    synchronized (obj){
                        System.out.println("22我要包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了22开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("做好了");
                        //obj.notify();//如果有多个等待线程，随机唤醒一个
                        obj.notifyAll();//唤醒所有等待的线程
                        //唤醒之后执行的代码
                    }
                }
            }
        }.start();

    }
}
