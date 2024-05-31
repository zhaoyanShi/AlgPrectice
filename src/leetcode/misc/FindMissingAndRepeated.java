package leetcode.misc;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/find-missing-and-repeated-values/description/
public class FindMissingAndRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = {-1, -1};
        int n = grid.length;

        Set<Integer> exists = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (exists.contains(grid[i][j])) {
                    result[0] = grid[i][j]; //repeated
                }
                exists.add(grid[i][j]);
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if(!exists.contains(i)) {
                result[1] = i; // missing
            }
        }

        return result;
    }
}
