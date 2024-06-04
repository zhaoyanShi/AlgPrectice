package leetcode.array.top100liked;

public class MergeIntervals_Test {
    public static void main(String[] args) {
        MergeIntervals instance = new MergeIntervals();

        int[][] input = null;
        int[][] result = null;

        input = new int[][]{{0,0},{1,2},{5,5},{2,4},{3,3},{5,6},{5,6},{4,6},{0,0},{1,2},{0,2},{4,5}};
//        result = instance.merge_byArray(input);
        result = instance.merge_byTreeSet(input);
        System.out.println(formatArray(result));
        System.out.println("expected: [[0,6]]");

        input = new int[][]{{4,4},{3,5},{2,3},{1,1},{3,3},{1,3},{2,2},{0,0},{5,5},{0,0},{4,6}};
//        result = instance.merge_byArray(input);
        result = instance.merge_byTreeSet(input);
        System.out.println(formatArray(result));
        System.out.println("expected: [[0,0],[1,6]]");
    }

    static String formatArray(int[][] input){
        StringBuilder sb = new StringBuilder();
        for (int[] ints : input) {
            sb.append(String.format("[%s,%s]", ints[0], ints[1]));
        }
        return "[" + sb.toString() + "]";
    }
}
