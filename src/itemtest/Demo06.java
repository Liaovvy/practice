package itemtest;

import java.util.ArrayList;

/**
 * @Auther: yuguo
 * @Date: 2022/2/7 - 02 - 07 - 14:15
 * @Description: itemtest
 * @version: 1.0
 * Lambda表达式，是可推导，可以省略
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 *      1.（参数列表）：括号参数列表的数据类型，可以省略不写
 *      2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
 *      3.（一些代码）：如果（）中的代码只有一行，无论是否由返回值，都可以省略（{}，return，分号）
 *          注意：要省略{}，return，分号必须一起省略
 */
public class Demo06 {
    public static void main(String[] args) {
        ArrayList<String> li1 = new ArrayList<>();

    }
}
