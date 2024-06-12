package leetcode.binarytree.top100liked;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
public class FlattenBinaryTreeToLinkedList {

    public void flatten_moveLeftToRight(TreeNode root) {
        TreeNode current = root;
        while(current != null) {
            if(current.left == null) {
                current = current.right;
            } else {
                TreeNode next = current.left;
                TreeNode pre = next;
                while (pre.right != null) {
                    pre = pre.right;
                }

                pre.right = current.right;
                current.left = null;
                current.right = next;
            }
        }
    }

    public void flatten_preorderTraversalToList(TreeNode root) {

        if(root == null) return;

        List<TreeNode> list = new ArrayList<>();
        recursionPreorder(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode node = list.get(i);
            node.left = null;
            node.right = list.get(i+1);
        }
        root = list.get(0);

    }

    public void flatten_preorderTraversalLoopToList(TreeNode root) {
        if(root == null) return;
        List<TreeNode> list = loopPreorder(root);
        for (int i = 0; i < list.size() - 1; i++) {
            TreeNode node = list.get(i);
            node.left = null;
            node.right = list.get(i+1);
        }
        root = list.get(0);
    }

    private void recursionPreorder(TreeNode root, List<TreeNode> list) {
        if(root != null) {
            list.add(root);
            recursionPreorder(root.left, list);
            recursionPreorder(root.right, list);
        }
    }

    private List<TreeNode> loopPreorder(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode node = root;
        while(node != null || !stack.isEmpty()) {
            while(node != null) {
                nodeList.add(node);
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            node = node.right;
        }

        return nodeList;
    }
}
