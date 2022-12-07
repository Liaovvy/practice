package another;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

/**
 * @Auther: yuguo
 * @Date: 2022/1/28 - 01 - 28 - 10:23
 * @Description: another
 * @version: 1.0
 */
public class TreeNodet {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNodet() {}
        TreeNodet(int val) { this.val = val; }
        TreeNodet(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
