package leetcode.array.top100liked;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//https://leetcode.cn/problems/merge-intervals
public class MergeIntervals {
    public int[][] merge_byArray(int[][] intervals) {
        int maxEnd = findMaxEnd(intervals);
        int[] array = new int[maxEnd + 1];

        for (int[] interval : intervals) {
            int s = interval[0], e = interval[1];
            if (s == e) {
                if (array[s] == 0) array[s] = Integer.MIN_VALUE;
            } else {
                if (array[s] == Integer.MIN_VALUE) array[s] = -1;
                else array[s]--;

                if (array[e] == Integer.MIN_VALUE) array[e] = 1;
                else array[e]++;
            }
        }


        int intervalCount = 0;
        int s = 0;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Integer.MIN_VALUE) {
                if (intervalCount == 0)
                    list.add(new int[]{i, i});
            } else {
                if (array[i] < 0) {
                    if (intervalCount == 0) s = i;
                    intervalCount += array[i];
                } else if (array[i] > 0) {
                    intervalCount += array[i];
                    if (intervalCount == 0) {
                        list.add(new int[]{s, i});
                    }
                }
            }
        }

        return list.toArray(new int[][]{});

    }

    public int[][] merge_byTreeSet(int[][] intervals) {
        TreeMap<Integer, Integer> endpoints = new TreeMap<>();
        for (int[] interval : intervals) {
            int s = interval[0], e = interval[1];
            if (s == e) {
                if (!endpoints.containsKey(s)) endpoints.put(s, Integer.MIN_VALUE);
            } else {
                if(endpoints.containsKey(s) && endpoints.get(s).equals(Integer.MIN_VALUE)) endpoints.put(s, -1);
                else endpoints.put(s, endpoints.getOrDefault(s,0)-1);

                if(endpoints.containsKey(e) && endpoints.get(e).equals(Integer.MIN_VALUE)) endpoints.put(e, 1);
                else endpoints.put(e, endpoints.getOrDefault(e, 0)+1);
            }
        }

        int intervalCount = 0;
        int s = 0;
        List<int[]> list = new ArrayList<>();
        for (Integer point : endpoints.keySet()) {
            Integer value = endpoints.get(point);
            if(value == Integer.MIN_VALUE) {
                if (intervalCount == 0)
                    list.add(new int[]{point, point});
            } else {
                if(value < 0) {
                    if (intervalCount == 0) s = point;
                    intervalCount += value;
                }else if (value > 0) {
                    intervalCount += value;
                    if (intervalCount == 0) {
                        list.add(new int[]{s, point});
                    }
                }
            }
        }

        return list.toArray(new int[][]{});
    }

    int findMaxEnd(int[][] intervals) {
        int max = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            max = Math.max(max, interval[1]);
        }
        return max;
    }
}
