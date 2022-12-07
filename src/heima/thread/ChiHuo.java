package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/27 - 01 - 27 - 11:04
 * @Description: heima.thread
 * @version: 1.0
 */
public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    @Override
    public void run(){
        while(true){
            synchronized(bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒之后的操作
                System.out.println("正在吃"+bz.xian+bz.pi+"的包子！");
                bz.flag = false;
                bz.notify();
                System.out.println("吃完了"+bz.xian+bz.pi+"的包子，正在生产包子");
                System.out.println("------------------------------");
            }
        }
    }
}
