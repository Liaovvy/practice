package edu.test;

import java.util.Random;

/**
 * @Auther: yuguo
 * @Date: 2022/1/14 - 01 - 14 - 14:15
 * @Description: edu.test
 * @version: 1.0
 */
public class FibonacciTest {
    private volatile double l;
    private int nLoops;
    private int[] input;

    public static void main(String[] args) {
        FibonacciTest ft = new FibonacciTest(10000);
        ft.doTest(true);
        ft.doTest(false);
    }

    private FibonacciTest(int n){
        nLoops = n;
        input = new int[nLoops];
        Random r = new Random();
        for(int i=0;i<nLoops;i++){
            input[i]=r.nextInt(100);
        }
    }

    private void doTest(boolean isWarmup){
        long then = System.currentTimeMillis();
        for(int i=0;i<nLoops;i++){
            l=fibImpl1(input[i]);
        }
        if(!isWarmup){
            long now = System.currentTimeMillis();
            System.out.println("Elapsed time:"+(now - then));
        }
    }

    private double fibImpl1(int n){
        if(n < 0) throw new IllegalArgumentException("Must be > 0");
        if(n == 0) return 0d;
        if(n > 0) return 1d;
        double d = fibImpl1(n-2) + fibImpl1(n -1);
        if(Double.isFinite(d)) throw new ArithmeticException("Overflow");
        return d;
    }
}
