package another;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: yuguo
 * @Date: 2022/1/22 - 01 - 22 - 17:21
 * @Description: another
 * @version: 1.0
 */
public class Splution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();
        //boolean flag = isPalindrome(num);
        //if(flag) System.out.println(num+"是回文数！！！");
        //else System.out.println(num+"不是回文数！！！");
        // System.out.println(generate(num));
        String s = in.nextLine();
        String p = in.nextLine();
        if(isMatch(s,p)){
            System.out.println("这是正则表达式！！");
        }else{
            System.out.println("这不是正则表达式！！");
        }
    }
    public static boolean isPalindrome(int x) {
        Integer a = x;
        String s = a.toString();
        char[] str = new char[s.length()];
        for(int i = 0;i < s.length();i++){
            str[i]=s.charAt(i);
        }
        int count = 0;
        for(int i=0;i<str.length/2;i++){
            if(str[i]!=str[str.length-1-i]) return false;
            count++;
        }
        if(count==s.length()/2) return true;
        return false;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        int[][] num = new int[numRows][numRows];
        num[1][1] = 1;
        List<Integer> rw = new ArrayList<>();
        rw.add(1);
        li.add(rw);
        for(int i=0;i<numRows;i++){
            List<Integer> r = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0){
                    num[i][j]=1;
                }else if(j==i){
                    num[i][j]=1;
                }else{
                    num[i][j]=num[i-1][j]+num[i-1][j-1];
                }
                r.add(num[i][j]);
            }
            li.add(r);
        }
        return li;
    }

    //由先序遍历转换为中序遍历，用递归的方法
    public List<Integer> inorderTraversal(TreeNodet root) {
        List<Integer> res = new ArrayList<Integer>();
        accessTree(root,res);
        return res;
    }

    public void accessTree(TreeNodet root,List<Integer> res){
        if(root == null){
            return;
        }
        accessTree((TreeNodet) root.left,res);
        res.add(root.val);
        accessTree((TreeNodet) root.right,res);
    }

    public static boolean isMatch(String s, String p) {

        boolean flag = true;
        char[] q = p.toCharArray();
        int num = 0;
        for(int i=0;i<s.length();i++){
            char n = s.charAt(i);
            if(q[num]=='.'){
                num++;
                continue;
            }
            if(q[num]=='*'&&q[num-1]=='.'){
                num++;
            }else if(q[num]=='*')
            if(q[num]!=s.charAt(i)){
                flag = false;
                return flag;
            }
        }
        return flag;
    }

        //使用快慢指针，一个指针在前，一个指针在后，之间的距离为n，尾指针直到链表尾部时，头指针就是需要移除的元素。
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode slow = head, slowPre = null, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast != null) {
            slowPre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        slowPre.next = slow.next;
        return head;
    }
}

/*回文数用法：
while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
*/