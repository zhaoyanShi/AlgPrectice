package leetcode.binarytree.top100liked;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/path-sum-iii/description/?envType=study-plan-v2&envId=top-100-liked
public class PathSumIII {

    private int ans;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> preSum = new HashMap<>();
        preSum.put(0l, 1);

        return ans;

    }

//    private void dfs(TreeNode node, long sum, int targetSum, Map<Long, Integer> preSum) {
//        if (node == null) return;
//
//        sum += node.val;
//        ans += preSum.getOrDefault(sum - targetSum, 0);
//        preSum.merge(sum, 1, Integer::sum);
//    }
}
