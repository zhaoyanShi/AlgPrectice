package leetcode.hash.top100liked;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams_sort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String s = String.valueOf(charArray);

            if(map.containsKey(s)) {
                map.get(s).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(s, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams_charCount(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] countArray = new int[26];
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                countArray[c - 'a'] ++;
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if(countArray[i] > 0) {
                    sb.append((char)(i + 'a'));
                    sb.append(countArray[i]);
                }
            }

            String key = sb.toString();
            if(map.containsKey(key)) {
                map.get(key).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }

        }

        return new ArrayList<>(map.values());
    }
}