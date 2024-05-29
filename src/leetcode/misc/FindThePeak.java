package leetcode.misc;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/find-the-peaks/description/
public class FindThePeak {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList();
        for (int i = 1; i < mountain.length - 1; i++) {
            if( mountain[i - 1] < mountain[i]
                    && mountain[i] > mountain[i+1]) {
                list.add(i);
            }
        }
        return list;
    }
}
