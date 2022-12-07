package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/26 - 01 - 26 - 16:00
 * @Description: heima.thread
 * @version: 1.0
 */
public class Demo01WaitNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        //创建一个顾客线程
        new Thread(){
            public void run(){
                while(true){

                    synchronized (obj){
                        System.out.println("我要包子");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子做好了开吃");
                        System.out.println("---------------------");
                    }
                }
            }
        }.start();
        //创建一个老板线程
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
                        obj.notify();
                        //唤醒之后执行的代码
                    }
                }
            }
        }.start();
    }
}
