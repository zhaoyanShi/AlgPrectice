package leetcode.binarytree.top100liked;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/?envType=study-plan-v2&envId=top-100-liked
public class ConstructBinaryTreeFromPreAndInTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;
        assert (preLen == inLen);

        Map<Integer, Integer> inValIndMap = new HashMap<>();
        for (int i = 0; i < inLen; i++) {
            inValIndMap.put(inorder[i], i);
        }

        return buildTree(preorder,
                0, preLen -1,
                0, inLen - 1,
                inValIndMap);

    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight,
                               int inLeft, int inRight,
                               Map<Integer, Integer> valIndMap) {

        if(preLeft > preLeft || inLeft > inRight) {
            return null;
        }

        int rootValue = preorder[preLeft];
        TreeNode root = new TreeNode(rootValue);

        int pivotIdnex = valIndMap.get(rootValue);
        root.left =
                buildTree(preorder,
                        preLeft + 1, pivotIdnex - inLeft + preLeft,
                        inLeft, pivotIdnex -1,
                        valIndMap);
        root.right =
                buildTree(preorder,
                        pivotIdnex - inLeft + preLeft + 1, preRight,
                        pivotIdnex + 1, inRight,
                        valIndMap);

        return root;
    }
}
