package leetcode.binarytree.top100liked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal_recursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursionInorder(root, list);
        return list;
    }

    public List<Integer> inorderTraversal_loop(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();

        TreeNode node = root;
        while(node != null || !nodes.isEmpty()) {
            if(node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                TreeNode tmp = nodes.pop();
                values.add(tmp.val);
                node = tmp.right;
            }
        }
        return values;
    }

    private void recursionInorder(TreeNode root, List<Integer> list) {
        if(root != null) {
            recursionInorder(root.left, list);
            list.add(root.val);
            recursionInorder(root.right, list);
        }
    }
}
