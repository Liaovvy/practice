package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/26 - 01 - 26 - 17:19
 * @Description: heima.thread
 * @version: 1.0
 * 注意：包子线程和包子铺线程关系--》通信（互斥）
 *       必须同时同步技术保证两个线程只能有一个在执行
 *       锁对象必须保证唯一，可以使用包子对象作为锁对象
 *       包子铺和吃货的类就需要把包子对象作为参数传递进来
 *       1.需要在成员位置定义一个包子变量
 *       2.使用带参数构造方法，位置个包子变量赋值
 */
public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    public void run(){
        int count = 0;
        //持续生产包子
        while(true){
            synchronized (bz){
                if(bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行，包子铺生产包子
                //交替生产包子
                if(count%2==0){
                    //生产薄皮
                    bz.pi = "薄皮";
                    bz.xian = "三鲜";
                }else{
                    bz.pi = "冰皮";
                    bz.xian = "羊肉大葱";
                }
                count++;
                System.out.println("正在生产");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("包子皮："+bz.pi+"包子馅："+bz.xian+" 开吃！！");
            }
        }
    }
}
