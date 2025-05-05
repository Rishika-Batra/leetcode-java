class Solution {
    public int reverse(int n) {
        int ne = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            
            if (ne > Integer.MAX_VALUE / 10 || (ne == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (ne < Integer.MIN_VALUE / 10 || (ne == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            ne = ne * 10 + digit;
        }
        return ne;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic positive number reversal
        int n1 = 123;
        int result1 = solution.reverse(n1);
        System.out.println("Test 1: n = " + n1);
        System.out.println("Output: " + result1); // Expected: 321
        
        // Test case 2: Negative number reversal
        int n2 = -123;
        int result2 = solution.reverse(n2);
        System.out.println("\nTest 2: n = " + n2);
        System.out.println("Output: " + result2); // Expected: -321
        
        // Test case 3: Number ending with zeros
        int n3 = 120;
        int result3 = solution.reverse(n3);
        System.out.println("\nTest 3: n = " + n3);
        System.out.println("Output: " + result3); // Expected: 21
        
        // Test case 4: Single digit
        int n4 = 7;
        int result4 = solution.reverse(n4);
        System.out.println("\nTest 4: n = " + n4);
        System.out.println("Output: " + result4); // Expected: 7
        
        // Test case 5: Zero
        int n5 = 0;
        int result5 = solution.reverse(n5);
        System.out.println("\nTest 5: n = " + n5);
        System.out.println("Output: " + result5); // Expected: 0
        
        // Test case 6: Positive overflow (exceeds Integer.MAX_VALUE)
        int n6 = 1534236469;
        int result6 = solution.reverse(n6);
        System.out.println("\nTest 6: n = " + n6);
        System.out.println("Output: " + result6); // Expected: 0 (overflow)
        
        // Test case 7: Negative overflow (exceeds Integer.MIN_VALUE)
        int n7 = -2147483648;
        int result7 = solution.reverse(n7);
        System.out.println("\nTest 7: n = " + n7);
        System.out.println("Output: " + result7); // Expected: 0 (overflow)
        
        // Test case 8: Large number within range
        int n8 = 2147483647;
        int result8 = solution.reverse(n8);
        System.out.println("\nTest 8: n = " + n8);
        System.out.println("Output: " + result8); // Expected: 0 (overflow)
    }
}