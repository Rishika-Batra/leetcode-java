public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0; // or throw exception depending on requirement
        
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSum = (currentSum > 0) ? currentSum + nums[i] : nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums)); // Output: 6
    }
}