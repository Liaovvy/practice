package itemtest;

/**
 * @Auther: yuguo
 * @Date: 2022/1/28 - 01 - 28 - 16:28
 * @Description: itemtest
 * @version: 1.0
 */
public class Demo03Cook {
    public static void main(String[] args) {
        invokeCook(new Cook(){

            @Override
            public void makeFood() {
                System.out.println("吃饭!!!!!");
            }
        });
        //----------------------------------------------------
        invokeCook(()->{
            System.out.println("吃放了");
        });
    }
    //定义一个方法，参数传递Cook接口，方法内部调用Cook接口的方法makeCook
    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
