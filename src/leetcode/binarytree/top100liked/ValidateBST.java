package leetcode.binarytree.top100liked;

import java.util.LinkedList;

//https://leetcode.cn/problems/validate-binary-search-tree/description/?envType=study-plan-v2&envId=top-100-liked
public class ValidateBST {
    public boolean isValidBST_recursion(TreeNode root) {
        return isBST_recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean isBST_recursion(TreeNode root, long low, long high) {
        if (root == null) return true;
        if (root.val <= low || root.val >= high) return false;

        return isBST_recursion(root.left, low, root.val)
                && isBST_recursion(root.right, root.val, high);
    }

    public boolean isValidBST_inorder(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList<>();
        TreeNode node = root;
        long value = Long.MIN_VALUE;
        while (node != null || !nodes.isEmpty()) {
            if(node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                if(node.val <= value) return false;
                value = node.val;
                node = node.right;
            }
        }
        return true;
    }
}
