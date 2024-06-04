package leetcode.binarytree.top100liked;

//https://leetcode.cn/problems/invert-binary-tree
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }

    //TODO try other solution, such as BFS, DFS
}
