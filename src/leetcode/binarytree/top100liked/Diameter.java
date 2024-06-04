package leetcode.binarytree.top100liked;

//https://leetcode.cn/problems/diameter-of-binary-tree/
public class Diameter {

    int maxd = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return maxd;
    }

    int depth(TreeNode root) {
        if (root == null)
            return 0;

        int lDepth = depth(root.left);
        int rDepth = depth(root.right);

        maxd = Math.max(maxd, lDepth + rDepth);
        return Math.max(lDepth, rDepth) + 1;
    }
}
