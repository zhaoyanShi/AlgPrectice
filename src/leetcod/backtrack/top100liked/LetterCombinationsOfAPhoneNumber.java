package leetcod.backtrack.top100liked;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.cn/problems/letter-combinations-of-a-phone-number/description/?envType=study-plan-v2&envId=top-100-liked
public class LetterCombinationsOfAPhoneNumber {

    final static Map<Character, String> dlMap = new HashMap<>();

    static {
        dlMap.put('2', "abc");
        dlMap.put('3', "def");
        dlMap.put('4', "ghi");
        dlMap.put('5', "jkl");
        dlMap.put('6', "mno");
        dlMap.put('7', "pqrs");
        dlMap.put('8', "tuv");
        dlMap.put('9', "wxyz");
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0 ) return ans;

        backtrack(ans, digits, 0, new StringBuffer());

        return ans;
    }

    private void backtrack(List<String> ans, String digits, int index, StringBuffer sb) {
        if (index == digits.length()) {
            ans.add(sb.toString());
        } else {
            char digit = digits.charAt(index);
            for (char c : dlMap.get(digit).toCharArray()) {
                sb.append(c);
                backtrack(ans, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
