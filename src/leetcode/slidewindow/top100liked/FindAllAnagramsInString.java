package leetcode.slidewindow.top100liked;
//https://leetcode.cn/problems/find-all-anagrams-in-a-string

import java.util.*;

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int length = s.length();
        int len = p.length();
        Map<Character, Integer> subCharMap = null;
        Map<Character, Integer> targetCharMap = toCharMap(p);
        boolean isMatch = false;
        for (int i = 0; i + len <= length; i++) {
            String sub = s.substring(i, i + len);
            if (i == 0) {
                subCharMap = toCharMap(s.substring(0, len));
            } else {
                char removeChar = s.charAt(i-1);
                char addChar = sub.charAt(sub.length() - 1);

                if(removeChar == addChar && isMatch) {
                    list.add(i);
                    continue;
                }
                if (removeChar != addChar) {
                    if(subCharMap.get(removeChar) > 1) {
                        subCharMap.put(removeChar, subCharMap.get(removeChar) - 1);
                    } else {
                        subCharMap.remove(removeChar);
                    }
                    if (subCharMap.containsKey(addChar)) {
                        subCharMap.put(addChar, subCharMap.get(addChar) + 1);
                    } else {
                        subCharMap.put(addChar, 1);
                    }
                }
            }

            if (sub.equals(p) || isMapEquals(subCharMap, targetCharMap)) {
                list.add(i);
                isMatch = true;
            } else {
                isMatch = false;
            }
        }
        return list;
    }

    boolean isMapEquals(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        if (!map1.keySet().equals(map2.keySet()))
            return false;

        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key)) return false;
            if (!map1.get(key).equals(map2.get(key))) return false;
        }

        return true;
    }

    Map<Character, Integer> toCharMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }


}
