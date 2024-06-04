package leetcode.matrix.top100liked;

import java.util.List;

public class SpiralMatrix_Test {
    public static void main(String[] args) {
        SpiralMatrix instance = new SpiralMatrix();

        int[][] input = null;
        List<Integer> list = null;

        input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        list = instance.spiralOrder(input);
        System.out.println(list);
        System.out.println("expected: [1, 2, 3, 6, 9, 8, 7, 4, 5]");

        input = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        list = instance.spiralOrder(input);
        System.out.println(list);
        System.out.println("expected: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]");

    }
}
