import java.util.Arrays;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] g = new StringBuilder[numRows];
        Arrays.setAll(g, k -> new StringBuilder());
        int i = 0, k = -1;
        for (char c : s.toCharArray()) {
            g[i].append(c);
            if (i == 0 || i == numRows - 1) {
                k = -k;
            }
            i += k;
        }
        return String.join("", g);
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Basic zigzag with 3 rows
        String s1 = "PAYPALISHIRING";
        int rows1 = 3;
        String result1 = solution.convert(s1, rows1);
        System.out.println("Test 1: s = \"" + s1 + "\", numRows = " + rows1);
        System.out.println("Output: \"" + result1 + "\"");
        System.out.println("Expected: \"PAHNAPLSIIGYIR\"\n");
        
        // Test case 2: Zigzag with 4 rows
        String s2 = "PAYPALISHIRING";
        int rows2 = 4;
        String result2 = solution.convert(s2, rows2);
        System.out.println("Test 2: s = \"" + s2 + "\", numRows = " + rows2);
        System.out.println("Output: \"" + result2 + "\"");
        System.out.println("Expected: \"PINALSIGYAHRPI\"\n");
        
        // Test case 3: Single row
        String s3 = "PAYPALISHIRING";
        int rows3 = 1;
        String result3 = solution.convert(s3, rows3);
        System.out.println("Test 3: s = \"" + s3 + "\", numRows = " + rows3);
        System.out.println("Output: \"" + result3 + "\"");
        System.out.println("Expected: \"" + s3 + "\"\n");
        
        // Test case 4: Number of rows equals string length
        String s4 = "ABCDE";
        int rows4 = 5;
        String result4 = solution.convert(s4, rows4);
        System.out.println("Test 4: s = \"" + s4 + "\", numRows = " + rows4);
        System.out.println("Output: \"" + result4 + "\"");
        System.out.println("Expected: \"ABCDE\"\n");
        
        // Test case 5: Number of rows is 2
        String s5 = "PAYPALISHIRING";
        int rows5 = 2;
        String result5 = solution.convert(s5, rows5);
        System.out.println("Test 5: s = \"" + s5 + "\", numRows = " + rows5);
        System.out.println("Output: \"" + result5 + "\"");
        System.out.println("Expected: \"PYAIHRNAPLSIIG\"\n");
        
        // Test case 6: Single character
        String s6 = "A";
        int rows6 = 3;
        String result6 = solution.convert(s6, rows6);
        System.out.println("Test 6: s = \"" + s6 + "\", numRows = " + rows6);
        System.out.println("Output: \"" + result6 + "\"");
        System.out.println("Expected: \"A\"");
    }
}