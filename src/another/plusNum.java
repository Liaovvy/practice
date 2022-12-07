package another;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.awt.*;
import java.util.ArrayList;

/**
 * @Auther: yuguo
 * @Date: 2022/1/25 - 01 - 25 - 10:45
 * @Description: another
 * @version: 1.0
 */
public class plusNum {
    public static void main(String[] args) {
        System.out.println(1);
        ListNode lw = new ListNode(7,null);
        System.out.println(lw.val+"="+lw.next);
        ListNode lq = new ListNode(2,lw);
        System.out.println(lq.val+"="+lq.next.next);
        ListNode l1 = new ListNode(5,lq);
        ListNode lr = new ListNode(2,null);
        ListNode le = new ListNode(2,lr);
        ListNode l2 = new ListNode(2,le);
       // ListNode no = addTwoNumbers(l1,l2);

        for(ListNode q = l1;q!=null;q= q.next){
            System.out.println(q.val);
        }
    }
    public static ListNode adTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode no = new ListNode(0);
        while(l1!=null||l2!=null){
            flag = l1.val + l2.val + flag;
            ListNode sum = new ListNode();
            if(flag<10){
                sum.val = flag;
                flag=0;
            }else{
                no.val = flag % 10;
                flag = flag / 10;
            }
        }
        return no;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1), pre = dummyHead;
        int t = 0;
        while (l1 != null || l2 != null || t != 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            pre.next = new ListNode(t % 10);
            pre = pre.next;
            t /= 10;
        }
        System.gc();

        return dummyHead.next;
    }
}
