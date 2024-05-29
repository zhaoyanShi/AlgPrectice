package leetcode.top100liked.binarytree;

//https://leetcode.cn/problems/minimum-depth-of-binary-tree/
public class MinDepth {
    public int minDepth_recursion(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int min_depth = Integer.MAX_VALUE;
        if(root.left != null) {
            min_depth = Math.min(minDepth_recursion(root.left), min_depth);
        }
        if(root.right != null) {
            min_depth = Math.min(minDepth_recursion(root.right), min_depth);
        }

        return min_depth + 1;
    }
}
