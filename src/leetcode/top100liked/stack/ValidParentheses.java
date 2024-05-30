package leetcode.top100liked.stack;

import java.util.Stack;

//https://leetcode.cn/problems/valid-parentheses
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                Character pop = stack.pop();
                if (pop == '(' && c == ')'
                        || pop == '[' && c == ']'
                        || pop == '{' && c == '}'
                ) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty())
            return true;

        return false;
    }
}
