class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) { 
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > result.length()) {
                    result = sub; 
                }
            }
        }

        return result;
    }
    
    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: String with clear palindrome
        String s1 = "babad";
        String result1 = solution.longestPalindrome(s1);
        System.out.println("Test 1: s = \"" + s1 + "\"");
        System.out.println("Output: \"" + result1 + "\""); // Expected: "bab" or "aba"
        
        // Test case 2: Even-length palindrome
        String s2 = "cbbd";
        String result2 = solution.longestPalindrome(s2);
        System.out.println("\nTest 2: s = \"" + s2 + "\"");
        System.out.println("Output: \"" + result2 + "\""); // Expected: "bb"
        
        // Test case 3: Single character
        String s3 = "a";
        String result3 = solution.longestPalindrome(s3);
        System.out.println("\nTest 3: s = \"" + s3 + "\"");
        System.out.println("Output: \"" + result3 + "\""); // Expected: "a"
        
        // Test case 4: Entire string is palindrome
        String s4 = "racecar";
        String result4 = solution.longestPalindrome(s4);
        System.out.println("\nTest 4: s = \"" + s4 + "\"");
        System.out.println("Output: \"" + result4 + "\""); // Expected: "racecar"
        
        // Test case 5: No palindrome longer than 1 character
        String s5 = "abcde";
        String result5 = solution.longestPalindrome(s5);
        System.out.println("\nTest 5: s = \"" + s5 + "\"");
        System.out.println("Output: \"" + result5 + "\""); // Expected: "a" (or any single character)
        
        // Test case 6: Multiple palindromes
        String s6 = "abaxyz";
        String result6 = solution.longestPalindrome(s6);
        System.out.println("\nTest 6: s = \"" + s6 + "\"");
        System.out.println("Output: \"" + result6 + "\""); // Expected: "aba"
    }
}
