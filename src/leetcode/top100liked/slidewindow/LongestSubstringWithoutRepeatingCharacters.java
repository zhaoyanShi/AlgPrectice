package leetcode.top100liked.slidewindow;

import java.util.HashSet;
//https://leetcode.cn/problems/longest-substring-without-repeating-characters
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1) return n;

        int maxLength = 0;
        int l = 0, r = 1;
        HashSet<Character> charSet = new HashSet<>();
        charSet.add(s.charAt(l));
        while (r < n) {
            while (r < n && !charSet.contains(s.charAt(r))) {
                charSet.add(s.charAt(r));
                r++;
            }
            maxLength = Math.max(maxLength, r - l);

            charSet.remove(s.charAt(l));
            l++;
        }

        return maxLength;
    }
}
