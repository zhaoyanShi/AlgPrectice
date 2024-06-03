package leetcode.top100liked.subList;

//https://leetcode.cn/problems/subarray-sum-equals-k
import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int preSum = 0, count = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if(preSumMap.containsKey(preSum - k)) {
                count += preSumMap.get(preSum - k);
            }
            preSumMap.put(preSum, preSumMap.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
