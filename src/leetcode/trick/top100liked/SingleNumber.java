package leetcode.trick.top100liked;

//https://leetcode.cn/problems/single-number
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length;i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
