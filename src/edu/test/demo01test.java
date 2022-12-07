package edu.test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Auther: yuguo
 * @Date: 2022/1/7 - 01 - 07 - 17:02
 * @Description: edu.test
 * @version: 1.0
 */
public class demo01test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a = lengthOfLongestSubstring(str);
        System.out.println(a);
    }
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int sum = 0;
        int mark = 0;
        int a = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            sum++;
            a=Math.max(a,mark);
            if(map.containsKey(s.charAt(i))) {
                mark = map.get(s.charAt(i));
                if(mark>=a) sum = i - mark;
                System.out.println("sum   mark="+sum+mark);
            }
            System.out.println("sum="+sum);
            map.put(s.charAt(i),i);
            if(sum>count){
                count = sum;
                System.out.println("count=="+count);
            }
        }
        if(map.size()<count) count = map.size();
        return count;
    }

}
