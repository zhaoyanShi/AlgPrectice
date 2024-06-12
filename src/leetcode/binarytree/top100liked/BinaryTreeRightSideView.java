package leetcode.binarytree.top100liked;

import java.util.*;

//https://leetcode.cn/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=top-100-liked
public class BinaryTreeRightSideView {
    public List<Integer> rightSideView_BFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);

                if(i == size-1) list.add(node.val);
            }
        }
        return list;
    }

    public List<Integer> rightSideView_DFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> depthNodeMap = new HashMap<>();
        if (root == null) return list;

        Deque<TreeNode> nodeStack = new LinkedList<>();
        Deque<Integer> depthStack = new LinkedList<>();
        nodeStack.push(root);
        depthStack.push(0);
        int maxDepth = -1;
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if(node != null) {
                maxDepth = Math.max(maxDepth, depth);
                if(!depthNodeMap.containsKey(depth)) depthNodeMap.put(depth, node.val);

                nodeStack.push(node.left);
                depthStack.push(depth + 1);
                nodeStack.push(node.right);        //LIFO, right node will be pop before left
                depthStack.push(depth + 1);
            }
        }


        for (int i = 0; i <= maxDepth; i++) {
            list.add(depthNodeMap.get(i));
        }

        return list;
    }
}
