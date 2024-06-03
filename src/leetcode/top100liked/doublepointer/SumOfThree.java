package leetcode.top100liked.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://leetcode.cn/problems/3sum/
public class SumOfThree {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;

        for (int i = 0; i < length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int r = length - 1;
            int target = 0 - nums[i];
            for (int l = i + 1; l < length; l++) {

                if (l > i + 1 && nums[l] == nums[l - 1]) continue;

                while (l < r && (nums[l] + nums[r] > target)) r--;

                if (l == r) break;

                if (nums[l] + nums[r] == target) {
                    List<Integer> item = Arrays.asList(nums[i], nums[l], nums[r]);
                    ans.add(item);
                }
            }
        }

        return ans;
    }
}
