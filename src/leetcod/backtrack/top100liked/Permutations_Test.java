package leetcod.backtrack.top100liked;

import java.util.List;

public class Permutations_Test {
    public static void main(String[] args) {
        Permutations obj = new Permutations();

        List<List<Integer>> result = null;
        result = obj.permute(new int[]{1, 2, 3,});
        System.out.println(result);
    }
}
