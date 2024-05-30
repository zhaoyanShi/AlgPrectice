package leetcode.top100liked.dynamicplanning;

//https://leetcode.cn/problems/pascals-triangle

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> previousRow = null;
        for (int i = 1; i <= numRows; i++) {
            if (i > 2) {
                previousRow = pascalsTriangle.get(i - 2);
            }
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    row.add(1);
                } else if (j == i) {
                    row.add(1);
                } else {
                    if(previousRow != null) {
                        row.add(previousRow.get(j - 2) + previousRow.get(j-1));
                    }
                }
            }
            pascalsTriangle.add(row);
        }

        return pascalsTriangle;
    }
}
