package leetcode.binarytree.top100liked;

import java.util.*;

//https://leetcode.cn/problems/binary-tree-level-order-traversal/description/?envType=study-plan-v2&envId=top-100-liked
public class LevelOrderTraversal {

    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(levelNodes);
        }

        return list;
    }

    public List<List<Integer>> levelOrder_recursion(TreeNode root) {
        if (root == null) return ans;

        traversal(root, 0);
        return ans;
    }

    void traversal(TreeNode node, int level){
        if(ans.size() == level)
            ans.add(new ArrayList<Integer>());

        ans.get(level).add(node.val);
        if(node.left != null)
            traversal(node.left, level + 1);
        if(node.right != null)
            traversal(node.right, level + 1);
    }

}
