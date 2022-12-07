package edu.test;

/**
 * @Auther: yuguo
 * @Date: 2022/1/7 - 01 - 07 - 20:05
 * @Description: edu.test
 * @version: 1.0
 */

public class demo02test {
    public static void main(String[] args) {
        int[] a1 = {1,2};
        int[] a2 = {3,4};
        int s = 0;
        s = (int) findMedianSortedArrays(a1,a2);
        System.out.println("s="+s);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int n1 = nums1.length;
            int n2 = nums2.length;
            int p1 = 0;
            int p2 = 0;
            double median = 0;
            int[] arr = new int[n1 + n2];
        System.out.println("length="+arr.length);
            if (nums1 == null) {
                arr[0] = nums2[0];
            } else {
                arr[0] = nums1[0];
            }
            for (int i = 0; i < arr.length / 2 + 1; i++) {
                if (p2 == n2 || (p1 < n1 && nums1[p1] < nums2[p2])) {
                    arr[i] = nums1[p1++];
                    System.out.println("arr="+arr[i]);
                } else {
                    arr[i] = nums2[p2++];
                    System.out.println("arr="+arr[i]);
                }
            }
            for(int i=0;i<arr.length/2+1;i++){
                System.out.println(arr[i]);
            }
        if (arr.length % 2 == 0) {
            median = (arr[arr.length / 2-1] + arr[arr.length / 2])/2.0;
            System.out.println("a1="+arr[arr.length / 2-1]+"a2="+arr[arr.length / 2]);
            System.out.println("1median="+median);
        } else {
            int a = arr.length / 2;
            median = arr[a];
            System.out.println("2median="+median+"a="+a);
        }
        return median;
    }
}