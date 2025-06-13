import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (charSet.contains(s.charAt(j))) {
                    break;
                } else {
                    charSet.add(s.charAt(j));
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: String with repeating characters
        String s1 = "abcabcbb";
        int result1 = solution.lengthOfLongestSubstring(s1);
        System.out.println("Test 1: s = \"" + s1 + "\"");
        System.out.println("Output: " + result1); // Expected: 3 ("abc")
        
        // Test case 2: String with all unique characters
        String s2 = "bbbbb";
        int result2 = solution.lengthOfLongestSubstring(s2);
        System.out.println("\nTest 2: s = \"" + s2 + "\"");
        System.out.println("Output: " + result2); // Expected: 1 ("b")
        
        // Test case 3: Empty spaces and special characters
        String s3 = "pwwkew";
        int result3 = solution.lengthOfLongestSubstring(s3);
        System.out.println("\nTest 3: s = \"" + s3 + "\"");
        System.out.println("Output: " + result3); // Expected: 3 ("wke")
        
        // Test case 4: All unique characters
        String s4 = "abcdefgh";
        int result4 = solution.lengthOfLongestSubstring(s4);
        System.out.println("\nTest 4: s = \"" + s4 + "\"");
        System.out.println("Output: " + result4); // Expected: 8
        
        // Test case 5: Empty string
        String s5 = "";
        int result5 = solution.lengthOfLongestSubstring(s5);
        System.out.println("\nTest 5: s = \"" + s5 + "\"");
        System.out.println("Output: " + result5); // Expected: 0
        
        // Test case 6: Single character
        String s6 = "a";
        int result6 = solution.lengthOfLongestSubstring(s6);
        System.out.println("\nTest 6: s = \"" + s6 + "\"");
        System.out.println("Output: " + result6); // Expected: 1
    }
}