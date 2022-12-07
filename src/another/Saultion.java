package another;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Auther: yuguo
 * @Date: 2022/1/23 - 01 - 23 - 15:17
 * @Description: another
 * @version: 1.0
 */
public class Saultion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num2 = {1,2,3};
        int[] num1 = new int[4];
        for(int i : num2){
            num1[i]=num2[i-1];
            System.out.println(num1[i]);
        }
        //String s = in.nextLine();
        /*if(isValid(s)){
            System.out.println("这是有效括号");
        }else{
            System.out.println("这是无效括号");
        }*/
        //int num = lengthOfLastWord(s);
        //System.out.println("num="+num);

    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()%2==1 || s==null) return false;
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(testBrackets(s.charAt(i)));
                System.out.println(i+"="+st+" "+st.isEmpty());
            } else if(st.peek().equals(s.charAt(i))){
                st.pop();
                System.out.println("s="+st);
            }else{
                st.push(testBrackets(s.charAt(i)));
            }
            System.out.println("="+st);
        }
        return st.isEmpty();
    }
    public static Character testBrackets(char s){
        char str;
        System.out.println("符号测试="+s);
        switch(s){
            case '(': str=')';break;
            case '{': str='}';break;
            case '[': str=']';break;
            case '<': str='>';break;
            default: return 'q';
        }
        return str;
    }

    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int length = str.length();
        int sum = 0;
        for(int i=length-1;i>=0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            sum++;
        }
        return sum;
    }
    public static String addBinary(String a, String b) {
        //输入: a = "1010", b = "1011"
        //输出: "10101"
        StringBuilder sb = new StringBuilder();
        int str = 0;
        int i = a.length()-1,j=b.length()-1;
        while(i>0||i>0){
            if(i>0){
                str += a.charAt(i) - '0';
            }
            if(j>0){
                str += b.charAt(j--) - '0';
            }
            sb.append(str%2);
            str = str / 2;
        }
        if(str!=1){
            return sb.reverse().toString();
        }
        sb.append(1);
        return sb.reverse().toString();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i : nums2){
                nums1[i-1]=nums2[i-1];
            }
        }else if(n==0){

        }else{
            int a=0,b=0;
            while(a<m||b<n){
                nums1[a+b]=(nums1[a]>=nums2[b])?nums1[a++]:nums2[b++];
            }
        }
    }
}
