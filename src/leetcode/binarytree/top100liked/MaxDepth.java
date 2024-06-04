package leetcode.binarytree.top100liked;

//https://leetcode.cn/problems/maximum-depth-of-binary-tree/
import java.util.LinkedList;
import java.util.List;

public class MaxDepth {
    public int maxDepth_BFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<TreeNode> tmp = new LinkedList<>();
            for (TreeNode node : nodes) {
                if(node.left != null) tmp.add(node.left);
                if(node.right != null) tmp.add(node.right);
            }
            nodes = tmp;
            depth ++;
        }


        return depth;
    }

    int maxDepth_recursion(TreeNode root) {
        if(root == null) {
            return 0;
        } else {
            int leftMaxDepth = maxDepth_recursion(root.left);
            int rightMaxDepth = maxDepth_recursion(root.right);
            return Math.max(leftMaxDepth, rightMaxDepth) + 1;
        }
    }
}
