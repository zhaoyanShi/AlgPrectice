package leetcode.top100liked.binarytree;

public class MaxDepth_Test {
    public static void main(String[] args) {
        MaxDepth_Test test = new MaxDepth_Test();
        MaxDepth maxDepth = new MaxDepth();

        int depth;
        depth = maxDepth.maxDepth_BFS( test.buildTree());
        System.out.println(depth + "[expected 3]");

        depth = maxDepth.maxDepth_BFS( null);
        System.out.println(depth + "[expected 0]");

        depth = maxDepth.maxDepth_recursion( new TreeNode(3));
        System.out.println(depth + "[expected 1]");

    }

    TreeNode buildTree() {
//        [3,9,20,null,null,15,7] (L1) 3; (L2) 9, 20; (L3) null, null, 15, 7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20,
                new TreeNode(15),
                new TreeNode(7));

        return root;
    }
}
