import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                // Push to stack
                stack.push(c);
            } else {
                // If stack is empty, invalid
                if (stack.isEmpty()) {
                    return false;
                }

                // Check if the top matches
                char open = stack.pop();
                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }

        // Valid if stack is empty
        return stack.isEmpty();
    }
}