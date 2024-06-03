package leetcode.top100liked.array;

//https://leetcode.cn/problems/maximum-subarray
public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int pre = 0, max = Integer.MIN_VALUE;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(max, pre);
        }

        return max;
    }
}
