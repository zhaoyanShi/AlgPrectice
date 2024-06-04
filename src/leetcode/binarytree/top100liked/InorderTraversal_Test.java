package leetcode.binarytree.top100liked;

import java.util.List;

public class InorderTraversal_Test {
    public static void main(String[] args) {
        InorderTraversal_Test test = new InorderTraversal_Test();
        InorderTraversal traversal = new InorderTraversal();

        TreeNode treeNode = test.buildTree();
        List<Integer> values;
        values = traversal.inorderTraversal_loop(treeNode);
        System.out.println(values);

        values = traversal.inorderTraversal_recursion(treeNode);
        System.out.println(values);
    }


    TreeNode buildTree() {
        //       1
        //     /   \
        //  (null)  2
        //         /  \
        //        3   (null)
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2, new TreeNode(3), null);
        return root;
    }


}
