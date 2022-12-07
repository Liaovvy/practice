package edu.test;

import java.util.Stack;

/**
 * @Auther: yuguo
 * @Date: 2022/1/8 - 01 - 08 - 12:45
 * @Description: edu.test
 * @version: 1.0
 */
public class demo02Stack {
    private static Stack<Integer> head;
    private static Stack<Integer> tail;

    public demo02Stack() {
        Stack<Integer> head = new Stack<>();
        Stack<Integer> tail = new Stack<>();
    }

    public static void main(String[] args) {
        new demo02Stack();

    }

    public void appendTail(int value) {
        tail.push(value);
    }

    public int deleteHead() {
        while(tail.isEmpty()){
            head.push(tail.pop());
        }
        return head.pop();
    }

}
