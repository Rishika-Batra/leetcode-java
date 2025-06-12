import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] num = new int[l];
        for (int i = 0; i < nums1.length; i++) {
            num[i] = nums1[i];
        }
        for (int j = 0; j < nums2.length; j++) {
            num[j + nums1.length] = nums2[j];
        }
        double med = 0.0;
        Arrays.sort(num);
        if (l % 2 != 0) {
            med = (double) num[l / 2];
        } else {
            double med1 = (double) num[l / 2];
            double med2 = (double) num[(l / 2) - 1];
            med = (med1 + med2) / 2;
        }
        return med;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Arrays with odd total length
        int[] nums1_1 = {1, 3};
        int[] nums2_1 = {2};
        double result1 = solution.findMedianSortedArrays(nums1_1, nums2_1);
        System.out.println("Test 1: nums1 = " + Arrays.toString(nums1_1) + ", nums2 = " + Arrays.toString(nums2_1));
        System.out.println("Output: " + result1); // Expected: 2.0
        
        // Test case 2: Arrays with even total length
        int[] nums1_2 = {1, 2};
        int[] nums2_2 = {3, 4};
        double result2 = solution.findMedianSortedArrays(nums1_2, nums2_2);
        System.out.println("\nTest 2: nums1 = " + Arrays.toString(nums1_2) + ", nums2 = " + Arrays.toString(nums2_2));
        System.out.println("Output: " + result2); // Expected: 2.5
        
        // Test case 3: One empty array
        int[] nums1_3 = {};
        int[] nums2_3 = {1};
        double result3 = solution.findMedianSortedArrays(nums1_3, nums2_3);
        System.out.println("\nTest 3: nums1 = " + Arrays.toString(nums1_3) + ", nums2 = " + Arrays.toString(nums2_3));
        System.out.println("Output: " + result3); // Expected: 1.0
        
        // Test case 4: Larger arrays
        int[] nums1_4 = {1, 3, 5, 7};
        int[] nums2_4 = {2, 4, 6, 8};
        double result4 = solution.findMedianSortedArrays(nums1_4, nums2_4);
        System.out.println("\nTest 4: nums1 = " + Arrays.toString(nums1_4) + ", nums2 = " + Arrays.toString(nums2_4));
        System.out.println("Output: " + result4); // Expected: 4.5
        
        // Test case 5: Arrays with negative numbers
        int[] nums1_5 = {-2, -1};
        int[] nums2_5 = {3};
        double result5 = solution.findMedianSortedArrays(nums1_5, nums2_5);
        System.out.println("\nTest 5: nums1 = " + Arrays.toString(nums1_5) + ", nums2 = " + Arrays.toString(nums2_5));
        System.out.println("Output: " + result5); // Expected: -1.0
    }
}