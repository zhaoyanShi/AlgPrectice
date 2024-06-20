package leetcod.backtrack.top100liked;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/subsets/description/?envType=study-plan-v2&envId=top-100-liked
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());

        for (int num : nums) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                List<Integer> tmpList = new ArrayList<>(ans.get(i));
                tmpList.add(num);
                ans.add(tmpList);
            }
        }

        return ans;

    }
}
