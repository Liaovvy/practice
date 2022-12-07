package another;

import java.util.Queue;
import java.util.Scanner;

import static edu.test.demo03.test;

/**
 * @Auther: yuguo
 * @Date: 2022/1/21 - 01 - 21 - 10:15
 * @Description: another
 * @version: 1.0
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = longestPalindrome(a);
        System.out.println("最大回文子串"+b);
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int[] range = new int[2];
        System.out.println(range[0]);
        System.out.println(range[1]);
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
           i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    public static int findLongest(char[] str, int low, int[] range) {
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
        int ans = high;
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }
}
