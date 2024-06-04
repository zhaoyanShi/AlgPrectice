package leetcode.binarytree.top100liked;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.cn/problems/symmetric-tree/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean isSymmetric_loop(TreeNode root) {
        return check_loop(root, root);
    }

    boolean check(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;

        if(p == null || q == null)
            return false;

        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    boolean check_loop(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while  (!queue.isEmpty()) {
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();

            if(n1 == null && n2 == null)
                continue;

            if( (n1 == null || n2 == null) || (n1.val != n2.val) )
                return false;

            queue.offer(n1.left);
            queue.offer(n2.right);

            queue.offer(n1.right);
            queue.offer(n2.left);
        }

        return true;
    }
}
