package leetcode.matrix.top100liked;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroRow = new HashSet<>();
        Set<Integer> zeroColumn = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroRow.add(i);
                    zeroColumn.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(zeroRow.contains(i) || zeroColumn.contains(j)) matrix[i][j] = 0;
            }
        }

    }
}
