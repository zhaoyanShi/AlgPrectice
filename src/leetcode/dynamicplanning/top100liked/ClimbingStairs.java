package leetcode.dynamicplanning.top100liked;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/climbing-stairs
public class ClimbingStairs {
    public int climbStairs_rollingArray(int n) {
        int p = 0, q = 0, r = 1;
        for(int i = 0; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }


    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs_valueMap(int n) {
        calculate(n);
        return map.get(n);
    }

    void calculate(int n) {
        if(n <= 1) {
            map.put(n, 1);
        }
        if (!map.containsKey(n - 1)) {
            calculate(n-1);
        }

        if (!map.containsKey(n - 2)) {
            calculate(n - 2);
        }

        map.put(n, map.get(n - 1) + map.get(n - 2));
    }
}
