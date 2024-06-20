package leetcod.backtrack.top100liked;
//https://leetcode.cn/problems/combination-sum/?envType=study-plan-v2&envId=top-100-liked

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> solution = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans.clear();
        solution.clear();
        traceBack(candidates, target, 0, 0);
        return ans;
    }

    void traceBack(int[] nums, int target, int index, int sum) {
        if(target == sum) {
            ans.add(new ArrayList<>(solution));
            return;
        }

        if(sum > target) return;

        for (int i = index; i < nums.length; i++) {
            solution.add(nums[i]);
            sum += nums[i];
            traceBack(nums, target, i, sum);
            solution.remove(solution.size() -1 );
            sum -= nums[i];

        }
    }
}
