package leetcod.backtrack.top100liked;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        int len = nums.length;

        backtrackList(len, 0, numList, ans);
        return ans;

    }

    void backtrackList(int length, int index, List<Integer> numList, List<List<Integer>> result) {
        if(index == length) {
            result.add(new ArrayList<>(numList));
        }

        for (int i = index; i < length; i++) {
            Collections.swap(numList, index, i);
            backtrackList(length, index+1, numList, result);
            Collections.swap(numList, index, i);
        }
    }
}
