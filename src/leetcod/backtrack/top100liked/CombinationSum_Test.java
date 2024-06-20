package leetcod.backtrack.top100liked;

import java.util.List;

public class CombinationSum_Test {
    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();

        List<List<Integer>> ans = null;
        ans = obj.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(ans);
        System.out.println("expected: [[2, 2, 3], [7]]");

        ans = obj.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(ans);
        System.out.println("expected: [[2, 2, 2], [2, 3, 3], [3, 5]]");
    }
}
