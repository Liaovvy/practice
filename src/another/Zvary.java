package another;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * @Auther: yuguo
 * @Date: 2022/1/21 - 01 - 21 - 11:41
 * @Description: another
 * @version: 1.0
 */
public class Zvary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = longestPalindrome(a);
        System.out.println("最大回文子串"+b);
    }
    public static String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        if (s.length() == 1) return s;
        String even = "";
        String odd = "";
        String q= "";
        String flag = s.valueOf(s.charAt(0));;
        int index = 0;
        for (int k = 0; k <= s.length(); k++) {
            even = q;
            for(int i=k,j=k+1;i>=0 && j<s.length()&&subTest(even);i--,j++){
                q = s.substring(i,j+1);
                if(index<j-i+1){
                    index=j-i+1;
                    flag = even;
                }
            }
            for(int i=k-1,j=k+1;i>=0&&j<s.length()&&subTest(odd);i--,j++){
                odd=s.substring(i,j+1);
                if(index<j-i+1){
                    index=j-i+1;
                    flag = odd;
                }
            }
        }
        return flag;
    }
    public static boolean subTest(String s){
        String a ="";
        int num = 0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(s.length()-1-i)){
                num++;
            }
        }
        return num==s.length()/2;
    }
}
