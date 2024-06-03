package leetcode.misc;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/distribute-candies/
public class DistributeCandies {

    //candyType.length is even
    public int distributeCandies(int[] candyType) {
        Set<Integer> typeSet = new HashSet<>();
        for (int i : candyType) {
            typeSet.add(i);
        }

        return Math.min(typeSet.size(), candyType.length/2);

    }
}
