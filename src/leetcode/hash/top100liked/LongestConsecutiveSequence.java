package leetcode.hash.top100liked;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/longest-consecutive-sequence
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;
        for (int num : numSet) {
            if(numSet.contains(num-1))
                continue;

            int tmpLength = 1;
            int tmp = num + 1;
            while(numSet.contains(tmp)) {
                tmpLength ++;
                tmp ++;
            }

            maxLength = Math.max(maxLength, tmpLength);
        }

        return maxLength;
    }
}
