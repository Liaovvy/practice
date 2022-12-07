package heima.thread;

/**
 * @Auther: yuguo
 * @Date: 2022/1/27 - 01 - 27 - 11:09
 * @Description: heima.thread
 * @version: 1.0
 */
public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu s = new BaoZiPu(bz);
        ChiHuo chiHuo = new ChiHuo(bz);
        s.start();
        chiHuo.start();
    }
}
