package leetcode.binarytree.top100liked;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.cn/problems/kth-smallest-element-in-a-bst/description/?envType=study-plan-v2&envId=top-100-liked
public class kthSmallestElementInBST {

    public int kthSmallest_inorder(TreeNode root, int k) {
        LinkedList<TreeNode> nodes = new LinkedList<>();

        TreeNode node = root;

        while (node != null || !nodes.isEmpty()) {
            if(node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                k--;
                if(k == 0) break;
                node = node.right;
            }
        }
        return node.val;
    }
    public int kthSmallest_inorderToValueArray(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        LinkedList<TreeNode> nodes = new LinkedList<>();

        TreeNode node = root;

        while (node != null || !nodes.isEmpty()) {
            if(node != null) {
                nodes.push(node);
                node = node.left;
            } else {
                node = nodes.pop();
                values.add(node.val);
                node = node.right;
            }
        }
        return values.get(k-1);
    }
}
