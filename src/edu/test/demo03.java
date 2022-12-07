package edu.test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Auther: yuguo
 * @Date: 2022/1/9 - 01 - 09 - 17:49
 * @Description: edu.test
 * @version: 1.0
 */
public class demo03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String a = longestPalindrome(s);
        System.out.println(a);
    }
    public static String longestPalindrome(String s) {
        if(s==null) return "";
        if(s.length()==1) return s;
        char[] str = new char[s.length()];
        for(int i=0;i<s.length();i++){
            str[i] = s.charAt(i);
        }
        return s;
    }
    public static boolean test(String s){
        int a=0;
        System.out.println("a="+a);
        for(int i=0;i<s.length()/2;i++){
            if(Objects.equals(s.charAt(i),s.charAt(s.length()-i))) {
                a++;
            }
        }
        if(a==s.length()/2) return true;
        else return false;
    }
}
