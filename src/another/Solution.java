package another;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

/**
 * @Auther: yuguo
 * @Date: 2022/1/23 - 01 - 23 - 14:13
 * @Description: another
 * @version: 1.0
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String s1 = in.nextLine();
        //String s2 = in.nextLine();
        //int sum = romanToInt(s);
        //int num = strStr(s1,s2);
        //int[] a = {1,3,5,7};
        //int target = 2;
        //String s = "PAYPALISHIRING";
        //String sb = convert(s,4);
        //System.out.println(sb);
        //int num = searchInsert(a,target);
        //int num = maxSubArray(a);
//        //System.out.println("num="+num);
//        int[] nums = {3,0,-2,-1,1,2};
//        System.out.println(nums[1]);
//        List<List<Integer>> li = threeSum(nums);
//        System.out.println("w="+li);
//        System.out.println(nums[1]);
        boolean flag = isPalindrome(121);
        System.out.println("flag="+flag);

    }
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = Integer.toString(x);
        int head = 0;
        int tail = s.length()-1;
        System.out.println(tail);
        while(head<tail){
            if(s.charAt(head)!=s.charAt(tail)){
                System.out.println(s.charAt(head));
                System.out.println(s.charAt(tail));
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
}
    public String longestCommonPrefix(String[] strs) {
        return null;

    }
    public static int romanToInt(String s) {
        int num = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
            num = num+map.get(s.charAt(i));
            if(i!=0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                num = num - 2 * map.get(s.charAt(i-1));
            }
        }
        return num;
    }
    public static int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        if(!haystack.contains(needle)) return -1;
        int count = 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                count=i;
            }
        }
        return count;

    }
    public static int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            System.out.println("i="+i);
            System.out.println("num="+nums[i]);
            if(nums[i]>=target) count = i-1;
        }
        return count;
    }
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int start = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum = nums[0];
            if(start == 0 && nums[i]>0){
                start=i;
            }
            if(count<=0){
                count=nums[start];
            }
            if(sum>0){

            }
            sum=Math.max(sum,count);
        }
        return sum;
    }
    public static String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for(int i=0;i<numRows;i++){
            str[i] = "";
        }
        String st = "";
        int num = numRows * 2 - 2;
        for(int i=0;i<s.length();i++){
            int count = i%num;
            if(count>=numRows){
                count=num-count;
            }
            str[count]=str[count]+String.valueOf(s.charAt(i));
        }
        for(int i=0;i<numRows;i++){
            System.out.println(str[i]);
            st = st + str[i];
        }
        return st;
    }
    public int reverse(int x) {
        long n = 0;
        while(x!=0){
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
    public int myAtoi(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            int num = s.charAt(i);
            if(num>=65&&num<=122){
                return str==null?0:Integer.parseInt(str);
            }else if(num==32){
                continue;
            }else{
                str = str + s.charAt(i);
            }
        }
        return Integer.parseInt(str);
    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while(i!=j){
            int length = j-i;
            int x = height[i];
            int y = height[j];
            int area = length * Math.min(x,y);
            maxArea =  Math.max(maxArea,area);
            if(x>y){
                i++;
            }else{
                y--;
            }
        }
        return maxArea;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        System.out.println(1);
        List<List<Integer>> li = new ArrayList<>();
        if(nums.length<3) return li;
        int length = nums.length;
        Arrays.sort(nums);
        System.out.println(2);
        for(int i=0;i<length-2;i++){
            int flag = nums[i];
            int left = i + 1;
            int right = length-1;
            System.out.print(left);
            System.out.println(right);
            while(left<right){
                System.out.print("=="+left);
                System.out.println(right);
                int sum = flag + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(left);
                    l.add(right);
                    if(!li.isEmpty() && !li.containsAll(l)){
                        System.out.println("l=="+l);
                        System.out.println("li=="+li);
                        li.add(l);
                    }
                    left++;
                    right--;
                }else if(sum >0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return li;
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        int min = Math.abs(sum - target);
        int length = nums.length;
        if(length==3) return sum;
        for(int i=0;i<length-2;i++){
            int flag = nums[i];
            int left = i+1;
            int right = length-1;
            while(left<right){
                int count = flag + nums[left] + nums[right];
                int minus = Math.abs(count - target);
                if(count==target){
                    return target;
                }else if(count>target){
                    min = Math.min(min,minus);
                    right--;
                }else if(count<target){
                    min = Math.min(min,minus);
                    left--;
                }
                while(nums[left]==nums[left-1]&&min==minus){
                    left++;
                }
                while(nums[right]==nums[right+1]&&min==minus) {
                    right--;
                }
            }
        }
        return min;
    }
    public List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList<>();



        return li;
    }
    public int fourSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = 100000; // sum - target = diff so: sum = diff + target;
        for(int i = 0; i < n - 2; i ++) {
            int min = nums[i] + nums[i + 1] + nums[i + 2];
            if(min > target) {
                if(min - target < Math.abs(diff)) {
                    diff = min - target;
                }
                break;
            }
            int max = nums[i] + nums[n - 2] + nums[n - 1];
            if(max < target) {
                if(target - max < Math.abs(diff)) {
                    diff = max - target;
                }
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > target) {
                    k --;
                    if(sum - target < Math.abs(diff)) {
                        diff = sum - target;
                    }
                } else if(sum < target) {
                    j++;
                    if(target - sum < Math.abs(diff)) {
                        diff = sum - target;
                    }
                } else {
                    return target;
                }
            }
        }
        return diff + target;
    }
}
